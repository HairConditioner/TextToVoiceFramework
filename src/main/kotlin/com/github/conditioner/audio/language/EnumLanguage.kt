package com.github.conditioner.audio.language

private const val ACA: String = "aca"

private const val MAC: String = "mac"

private const val ATT: String = "att"

enum class EnumLanguage(val r: Int, val v: String) {
    /* English -----------------------------------*/
    // US
    SHARON(21, ACA),
    AMANDA(1, MAC),
    TRACY(16, ACA),
    RYAN(12, ACA),
    TIME(0, MAC),
    MIKE(1, ATT),
    ROD(20, ACA),
    // UK
    RACHEL(11, ACA),
    PETER(10, ACA),
    GRAHAM(4, ACA),
    SELENE(4, MAC),
    DARREN(3, MAC),
    CHARLES(2, ATT),
    AUDREY(3, ATT),
    /* -------------------------------------------*/

    /* Spanish -----------------------------------*/
    // Spain
    ROSA(20, ATT),
    ALBERTO(19, ATT),
    PAULA(7, MAC),
    // Mexico
    DIEGO(5, MAC),
    CAMILA(6, MAC),
    //Castile
    JOANQUIN(8, MAC),
    /* -------------------------------------------*/

    /* French ------------------------------------*/
    // France
    ALAIN(7, ATT),
    JULIETTE(8, ATT),
    BRUNO(1, ACA),
    ALICE(0, ACA),
    // Canada
    EMMANUEL(9, MAC),
    MARIE(10, MAC),
    LOUISE(22, ACA),
    /* -------------------------------------------*/

    /* German ------------------------------------*/
    REINER(5, ATT),
    KLARA(6, ATT),
    KLAUS(7, ACA),
    SARAH(14, ACA),
    BERTHA(11, MAC),
    JAKOB(12, MAC),
    /* -------------------------------------------*/

    /* Italian -----------------------------------*/
    VITTORIO(15, ACA),
    CHIARA(2, ACA),
    MARIO(13, MAC),
    VALENTINA(14, MAC),
    /* -------------------------------------------*/

    /* Portuguese --------------------------------*/
    // Brazil
    RENATA(16, MAC),
    // Portugal
    CELIA(21, ACA),
    ANDREA(18, MAC),
    JULIETA(17, MAC),
    /* -------------------------------------------*/

    /* Swedish -----------------------------------*/
    EMMA(24, ACA),
    ERIK(25, ACA),
    GUS(20, MAC),
    MAJA(19, MAC),
    /* -------------------------------------------*/

    /* Dutch -------------------------------------*/
    ANIKA(21, MAC),
    MARKUS(22, MAC)
    /* -------------------------------------------*/
}