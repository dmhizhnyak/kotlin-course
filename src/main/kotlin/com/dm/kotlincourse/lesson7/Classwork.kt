package com.dm.kotlincourse.lesson7

//fun main() {
////    var counter = 10
////    while (counter-- > 0) {
////        println(counter)
////    }
//    do { // делает -> думает
//        println("+")
//    } while (false)
//    for (i in 1..10) {
//        if (i == 2) continue
//        if (i == 7) break
//        println(i)
//    }
//}

fun main () {
//    for (i in 1..10) {
//        println(i)
//    }
//    for (i in 1..5) {
//       val quad = i*i
//       println(quad)
//    }
//    for (i in 10 downTo 1) {
//        println(i)
//    }
//    for (i in 20 downTo 2) {
//        if (i%2==0) {
//            println(i)
//        }
//    }
//    for (i in 1..30 step 3) {
//        println(i)
//    }
//    var count: Int = 1
//    var total: Int = 0
//    while (count <= 10) {
//        total += count++
//    }
//    println(total)

    var counter = 100
    while (counter++ > 1) {
        var a = counter.toString()
        when (a.length) {
            3 -> println("$a = 3")
            2 -> println("$a = 2")
            1 -> println("$a = 1")
        }
    }
}