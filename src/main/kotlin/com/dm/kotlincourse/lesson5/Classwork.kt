package com.dm.kotlincourse.lesson5

fun main () {
    var a = 15
    var b = 18
    println(a * b)

    println(--a)

// Не - И - ИЛИ
//    var c = (3 + 2 < 6) && (4 * 2 == 8)
//
//
//    var d = (10 - 5 >= 5) || (2 * 3 != 6)
//
//    var e = ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2)
//
//    var g = ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4)
//
//    ((var j = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4)
//
//
//    (var k = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5)
//    false && true || false
//
//    (var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5))
//        true||(true&&true) //true
//
//    ((var d = 5; d-- == 5) && (8 / 4 == 2)) || (2 * 3 != 6)
//    (true&&true)||false
//    (var e = 2; e++ < 3) && ((7 + 1 == 8) || (4 % 2 != 0))
//    true && true || true
//
//    val name = String? = null
//    var res = if (name == null) {
//        "unknown"
//    } else {
//        name
//    }
//    val result = name ?: "unknown"
//
//    fun printNoise (userVolume: Int?) {
//        val defaultVolume = 30
//        println(userVolume ?: defaultVolume)
//    }
//
//    fun PrintPrice (itemPrice: Double?, s: Int?) {
//        val k = (100 - s ?: 0))/100.0
//        println(itemPrice*k)
//    }
//    fun printLanguage (lanf: String?) {
//        val default Lang: String = "Eng"
//        println(lang ?: default)
//    }

    fun printBox (stuff: String?) {
        val s = stuff ?: throw Exception ("Box is empty")
        println(s)
    }
}
