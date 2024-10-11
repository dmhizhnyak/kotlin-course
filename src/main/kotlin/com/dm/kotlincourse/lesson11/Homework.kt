package com.dm.kotlincourse.lesson11

import com.dm.kotlincourse.lesson10.mutableSetString

fun main () {
    addPair(mutableMap)
    getKey(mutableMap)
    deleteKey(mutableMap)
    enumerationMap()
    val a: MutableMap<Double, Int> = mutableMapOf(1.00 to 1, 2.00 to 2, 3.00 to 3, 4.00 to 4, 5.00 to 0)
    replaceValue(a)
    addingDictionary()
    difficultMap()
    setsToValue()
    searchToValue()
}
//Задание 1: Создание Пустого Словаря
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val emptyMap: Map<Int, Int> = mapOf<Int, Int>()

//Задание 2: Создание и Инициализация Словаря
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val createMap: Map<Float, Double> = mapOf(2.013453f to 2.00)

//Задание 3: Создание Изменяемого Словаря
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val mutableMap: MutableMap<Int, String> = mutableMapOf<Int, String> ()

//Задание 4: Добавление Элементов в Словарь
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

fun addPair (mutableMap: MutableMap<Int, String>) {
    mutableMap[0] = "Zero"
    mutableMap[1] = "One"
    println(mutableMap)
}

//Задание 5: Получение Значений из Словаря
//Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.

fun getKey (mutableMap: MutableMap<Int, String>) {
    println(mutableMap[0])
    println(mutableMap[1])
}

//Задание 6: Удаление Элементов из Словаря
//Удалите определенный элемент из изменяемого словаря по его ключу.

fun deleteKey (mutableMap: MutableMap<Int, String>) {
    mutableMap.remove(0)
    println(mutableMap)
}

//Задание 7: Перебор Словаря в Цикле
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

fun enumerationMap () {
    val a: MutableMap<Double, Int> = mutableMapOf(1.00 to 1, 2.00 to 2, 3.00 to 3, 4.00 to 4, 5.00 to 0)
    for (i in a) {
        if (i.value == 0) {
            println("Бесконечность")
        }
        println("${i.key / i.value}")
    }
}

//Задание 8: Перезапись Элементов Словаря
//Измените значение для существующего ключа в изменяемом словаре.

fun replaceValue (mutableMap: MutableMap<Double, Int>) {
    mutableMap[1.0] = 7
    println(mutableMap)
}

//Задание 9: Сложение Двух Словарей
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

fun addingDictionary () {
    val mapOne: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val mapTwo: Map<Int, String> = mapOf(4 to "Four", 5 to "Five", 6 to "Six")

    val commonMap: MutableMap<Int, String> = mutableMapOf()
    for (i in mapOne) {
        for (j in mapOne) {
            commonMap[i.key] = i.value
        }
    }
    for (i in mapTwo) {
        for (j in mapTwo)
            commonMap[i.key] = i.value
    }
    println(commonMap)
}

//Задание 10: Словарь с Сложными Типами
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.

fun difficultMap () {
    val a: MutableMap<String, List<Int>> = mutableMapOf("KeyOne" to listOf(1, 2, 3, 4, 5), "KeyTwo" to listOf(6, 7, 8, 9))
    println(a)
}

//Задание 11: Использование Множества в Качестве Значения
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

fun setsToValue () {
    val a: MutableMap<Int, MutableSet<String>> = mutableMapOf(1 to mutableSetOf("One", "Two", "Three"), 2 to mutableSetOf("Four", "Five", "Six"))
    a[3] = mutableSetOf("Seven", "Eight", "Nine")
    a[3]?.add("Ten")
    println(a)
}

//Задание 12: Поиск Элемента по Значению
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

fun searchToValue () {
    val a: MutableMap<Pair<Int, Int>, Int> = mutableMapOf()
    a[1 to 2] = 2
    a[3 to 4] = 3
    a[5 to 6] = 4
    for (i in a.keys) {
        if ((i.second == 5) || (i.first == 5)) {
            println(a[i])
            }
    }
}