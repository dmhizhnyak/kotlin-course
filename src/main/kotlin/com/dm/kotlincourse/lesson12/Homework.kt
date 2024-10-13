package com.dm.kotlincourse.lesson12

fun main () {
    empty()
    twoInt(2,4)
    val listInt: List<Int> = listOf(-1,-2,3,4,5,6,7,8,12,14,156,67)
    averageValue(listInt)
    val testString = "Hello world"
    nullString(testString)
    returnInt()
    listNull(listInt)
    stringNull()
    val num = 14
    stringInt(num)
    nullArguments(testString, num)
    multiplyByTwo(num)
    isEven(num)
    printNumbersUntil(0)
    findFirstNegative(listInt)
    val listString: List<String?> = listOf("One", null, "Three")
    processList(listString)
    drawRectangle(10, 10)
    printMap(8,15)
}
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun empty () {

}
//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun twoInt (numOne: Int, numTwo: Int): Int {
    val amount = numOne + numTwo
    return amount
}
//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun string (string: String) {

}
//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun averageValue (listInt: List<Int>): Double {
    var average = 0.0
    for (i in listInt) {
        average += i.toDouble()
    }
    return  average/listInt.count()
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun nullString (string: String?): Int? {
    val testString = string ?: ""
    val countString = testString.count()
    return countString
}
//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun returnInt (): Double {
    return 3.14
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun listNull (list: List<Int>?) {
    return
}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun stringInt (num: Int): String? {
    val intToString = num.toString()
    return intToString
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun stringNull (): List<String?> {
    val list: List<String?> = listOf("One", null, "Three")
    return list
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun nullArguments (string: String?, int: Int?): Boolean? {
    return if ((string != null) && (int != null)) true
    else false
}
/*-------------------------------------------------------------------------------------------------------------------*/
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo (num: Int): Int {
    return num * 2
}

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven (num: Int): Boolean {
     return num % 2 == 0
}

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil (n: Int) {
    if (n < 1) return
    else {
        for (i in 1..n) {
            println(i)
        }
    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative (list: List<Int>): Int? {
    for (i in list) {
        if (i < 0) return i
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList (listString: List<String?>) {
    for (i in listString) {
        if (i == null) return
        println(i)
    }
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.

fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
    topLine(width)
    // Боковые границы
    middleLine(width, height)
    //Нижняя граница
    bottomLine(width)
}

private fun topLine (width: Int) {
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)
}

private fun middleLine (width: Int, height: Int) {
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }
}

private fun bottomLine (width: Int) {
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}

//Дополнительное задание для тех, кому очень скучно.

fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")

    xRange(xSize)
    yRange(xSize, ySize)
}

private fun xRange(xSize: Int) {
    val formatterSize = " $xSize".length
    val xRange = when {
        xSize > 0 -> 0..xSize
        else -> {0 downTo xSize}
    }
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
}

private fun yRange(xSize: Int, ySize: Int) {
    val formatterSize = " $xSize".length
    val yRange = when {
        ySize > 0 -> 0..ySize
        else -> {0 downTo ySize}
    }
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            if (j > xSize) continue
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}
