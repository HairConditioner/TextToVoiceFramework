package com.github.conditioner.audio

import com.github.conditioner.audio.language.EnumLanguage
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import okio.BufferedSink
import okio.buffer
import okio.sink
import java.io.File

fun main() {
    downloadVoice(EnumLanguage.AUDREY, 1, "Hello this is a test")
}

private fun downloadVoice(language: EnumLanguage, speed: Int, text: String) {
    val client = OkHttpClient()
    val body = RequestBody.create(MediaType.parse("application/json; charset=uft-8"), "{\"t\":\"$text\"}")
    val request: Request = Request.Builder()
        .url("https://kfiuqykx63.execute-api.us-east-1.amazonaws.com/Dev/tts?r=" + language.r + "&s=" + speed + "&l=0&v=" + language.v)
        .post(body)
        .addHeader("Accept", "*/*")
        .addHeader("Content-Type", "application/x-www-form-urlencoded")
        .addHeader("Origin", "https://www.naturalreaders.com")
        .addHeader("Referer", "https://www.naturalreaders.com/online/")
        .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")
        .addHeader("cache-control", "no-cache")
        .build()

    val response: Response = client.newCall(request).execute()
    val flags: Array<String> = arrayOf("[", "^", "a-z", "A-Z", "0-9", "\\", ".", "_", "]", "+")

    for (i in flags) {
        val fileName: String = text.replace(i, "_") +".mp3"
        val downloadedFile = File(fileName)
        val sink: BufferedSink = downloadedFile.sink().buffer()

        sink.writeAll(response.body()!!.source())
        sink.close()
    }
}