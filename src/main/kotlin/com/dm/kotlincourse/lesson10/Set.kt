package com.dm.kotlincourse.lesson10
fun main () {
    removeElement(mutableSetInt)
    outputToScreenSetInt(mutableSetInt)
    searchString(mutableSetString, "Go")
    unificationSet(mutableSetString, setSecondForUnification)
    intersectionSets(mutableSetInt, setSecondForUnificationInt)
    difference(mutableSetString, setSecondForUnification)
    converSetToList(mutableSetString)
}

/*-----------Задание 1: Создание Пустого Множества---------------*/
//Создайте пустое неизменяемое множество целых чисел.
val emptyReadOnlySet: Set<Int> = setOf()

/*-----------Задание 2: Создание и Инициализация Множества---------------*/
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
val readOnlySetInt: Set<Int> = setOf(1,2,3)

/*-----------Задание 3: Создание Изменяемого Множества---------------*/
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
val mutableSetString: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala", "Swift")

/*-----------Задание 4: Добавление Элементов в Множество---------------*/
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
val addNewElemetToSetSwift = mutableSetString.add("Swift")
val addNewElementToSetGo = mutableSetString.add("Go")

/*-----------Задание 5: Удаление Элементов из Множества---------------*/
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
val mutableSetInt: MutableSet<Int> = mutableSetOf(2, 3, 6, 89, 3, 2, 99, 123)
fun removeElement (set: MutableSet<Int>) {
    set.remove(3)
    println(set)
}

/*-----------Задание 6: Перебор Множества в Цикле---------------*/
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
fun outputToScreenSetInt (set: Set<Int>) {
    for (i in set) {
        println(i)
    }
}

/*-----------Задание 7: Проверка Наличия Элемента в Множестве---------------*/
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
fun searchString (set: MutableSet<String>, string: String): Boolean {
    for (i in set) {
        if (i == string) {
            println("True")
        }
    }
    return true
}

/*-----------Задание 8: Объединение Двух Множеств---------------*/
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
val setSecondForUnification: MutableSet<String> = mutableSetOf("C++", "C#", "Pascal", "Go", "Python", "Java")
fun unificationSet (setFirst: MutableSet<String>, setSecond: MutableSet<String>) {
    val newSet: MutableSet<String> = mutableSetOf()
    for (i in setFirst) {
        for (item in setSecond) {
            if (i != item) {
                newSet.add(i)
                newSet.add(item)
            }
        }
    }
    println(newSet)
}

/*-----------Задание 9: Нахождение Пересечения Множеств---------------*/
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
val setSecondForUnificationInt: MutableSet<Int> = mutableSetOf(2, 3, 4, 5, 6, 345, 767, 12, 989, 13, 52, 123, 99)
fun intersectionSets (setFirst: MutableSet<Int>, setSecond: MutableSet<Int>) {
    val newSet: MutableSet<Int> = mutableSetOf()
    for (i in setFirst) {
        for (item in setSecond) {
            if (i == item) {
                newSet.add(i)
            }
        }
    }
    println(newSet)
}

/*-----------Задание 10: Нахождение Разности Множеств---------------*/
//Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.
fun difference (setFirst: MutableSet<String>, setSecond: MutableSet<String>) {
    val newSet: MutableSet<String> = setFirst.toMutableSet()
    println("---$setFirst---")
    println("---$setSecond---")
    for (i in setFirst) {
        for (item in setSecond) {
            if (i == item) {
                newSet.remove(i)
            }
        }
    }
    println(newSet)
}

/*-----------Задание 11: Конвертация Множества в Список---------------*/
//Создайте множество строк и конвертируйте его в список с использованием цикла.
fun converSetToList (set: MutableSet<String>) {
    val newListString: MutableList<String> = mutableListOf()
    for (i in set) {
        newListString += i
    }
    println(newListString)
}