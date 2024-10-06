package com.dm.kotlincourse.lesson10

fun main () {
    taskOneToThree()
    taskFour()
    taskFive()
    taskSix()
    taskSeven()
    taskEight()
    taskNine()
    val arrayStringForSearch = arrayOf("One", "two", "Three five Neo", "Four", "six seven five")
    searchString(arrayStringForSearch, "Neo")

}

/*-----------Задание 1: Создание и Инициализация Массива---------------*/
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
fun taskOneToThree () {
    arrayOf(1,2,3,4,5)

/*---------------Задание 2: Создание Пустого Массива---------------*/
//Создайте пустой массив строк размером 10 элементов.
    Array(size = 10) { "" }

/*---------------Задание 3: Заполнение Массива в Цикле---------------*/
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val arrayDouble = arrayOf<Double> (1.0, 2.0, 3.0, 4.0, 5.0)
    for (i in arrayDouble.indices) {
        arrayDouble[i] = i*2.0
        println(arrayDouble[i])
    }
}

/*---------------Задание 4: Изменение Элементов Массива---------------*/
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
fun taskFour () {
    val arrayInt = arrayOf<Int>(1, 2, 3, 4, 5)
    for (i in arrayInt.indices) {
        arrayInt[i] = i * 3
        println(arrayInt[i])
    }
}

/*---------------Задание 5: Работа с Nullable Элементами---------------*/
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
fun taskFive () {
    val nullableArray: Array<String?> = arrayOfNulls<String>(size = 3)
    nullableArray[0] = null
    nullableArray[1] = "Hello"
    nullableArray[2] = "World"
    println(nullableArray)
}

/*---------------Задание 6: Копирование Массива---------------*/
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
fun taskSix () {
    val arrrayIntForCopy: Array<Int> = arrayOf(1, 2, 7, 4, 5)
    val arrayCopy = arrrayIntForCopy.copyOf()
    for (i in arrrayIntForCopy.indices) {
        arrayCopy[i] = arrrayIntForCopy[i]
        println(arrayCopy[i])
    }
}

/*---------------Задание 7: Разница Двух Массивов---------------*/
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
fun taskSeven () {
    val arrayOne: Array<Int> = arrayOf(2, 4, 6, 8, 10)
    val arrayTwo: Array<Int> = arrayOf(1, 1, 2, 3, 4)
    val arrayThree = Array(size = 5) { 1 }
    for (i in arrayThree.indices) {
        arrayThree[i] = arrayOne[i] - arrayTwo[i]
        println(arrayThree[i])
    }
}

/*---------------Задание 8: Поиск Индекса Элемента---------------*/
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
fun taskEight () {
    val arrayIntSearch = arrayOf(5, 2, 7, 4, 6, 8, 9, 1, 4, 65, 7)
    var a = 0
    while (a < arrayIntSearch.lastIndex) {
        ++a
        if (arrayIntSearch.contains(5)) println("-1")
        break
    }
}

/*---------------Задание 9: Перебор Массива---------------*/
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
fun taskNine () {
    val arrayEvenOddNumbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 90, 9, 54, 34, 3, 34, 5, 67, 6)
    for (i in arrayEvenOddNumbers) {
        when {
            i % 2 == 0 -> println("$i четное")
            i % 2 != 0 -> println("$i нечетное")
        }
    }
}

/*---------------Задание 10: Поиск Значения в Массиве по вхождению---------------*/
//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.
fun searchString (arrayString: Array<String>, string: String) {
    for (i in arrayString) when {
        arrayString.contains(string) -> return
    }
    println(string)
}


