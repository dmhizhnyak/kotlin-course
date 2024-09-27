package com.dm.kotlincourse.lesson6

fun checkPassword (password: String): Boolean {
    if (password.length < 8) return false
//    if (checkSymbols(password)) return true
//    return false
    return checkSymbols(password)
    }
fun checkSymbols (password: String): Boolean {
    return false
}
fun convertMark (mark: Int): String {
    return when (mark) {
            in 100..85 -> "A"
            in 84..60 -> "B"
            in 59..45 -> "C"
            in 44..30 -> "D"
            in 29..0 -> "E"
            else -> "Неверное значение"
    }
}
fun main () {
//    val intRange: IntRange = 1..10
//    val intRangeUntil = 1..10
//    val charRange: CharRange = 'a'..'g'
//
//    val inRange = 2 in intRange //Boolean
//    val notInRange = 2 !in intRange // boolean
//
//    when (значение) Х
//            выражение1 -> {/* КОД */ }
//    выражение2 -> {/* КОД */ }
//    else -> {/* КОД */ }
//
//    val a = 4
//    val b = 3
//
//    val max = if (a > b) {
//        a
//    } else {
//        b
//    }
//    val score = 98
//    var resault = when (score) {
//        in 90..100 -> "Отлично"
//        in 80..89 -> "Хорошо"
//        in 70..89 -> "Удовлетворительно"
//    }
//
//    fun getTimesOfDay(hour: Int): String {
//        return if (hour < 0 || > 23)
//     "Неверное значение времени"
//        if (hour in 0..4) {
//            "Ночь"
//        } else if (hour in 5..11) {
//            "Утро"
//        } else if (hour in 12..16) {
//            "День"
//        } else {
//            "Вечер"
//        }
//    }
    checkPassword("Blabla")
    convertMark(13)
}
