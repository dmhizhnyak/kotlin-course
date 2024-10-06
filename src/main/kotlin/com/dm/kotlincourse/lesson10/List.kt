package com.dm.kotlincourse.lesson10

fun main () {
    println(mutableListNew)
    val listInt: List<Int> = mutableListOf(1,2,3,4,5,6)
    printListInt(listInt)
    getSecondElement(mutableListStringNew)
    changeSecondIndex(mutableListInt, 48)
    unificationList(readOnlyListString, mutableListStringNew)
    minMaxValue(mutableListInt)
    searchEvenAndOdd(mutableListInt)
}
/*-----------Задание 1: Создание Пустого Списка---------------*/
//Создайте пустой неизменяемый список целых чисел.
val readOnlyList: List<Int> = listOf(1,2,3,4,5)

/*-----------Задание 2: Создание и Инициализация Списка---------------*/
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
val readOnlyListString: List<String> = listOf("Hello", "World", "kotlin")

/*-----------Задание 3: Создание Изменяемого Списка---------------*/
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
val mutableListInt: MutableList<Int> = mutableListOf(83,22,32,25,56,14,16,77, 24,98)

/*-----------Задание 4: Добавление Элементов в Список---------------*/
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
val mutableListNew = mutableListInt + mutableListOf(6,7,8)

/*-----------Задание 5: Удаление Элементов из Списка---------------*/
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
val mutableListStringNew: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
val mutableListRemove = mutableListStringNew.remove("World")

/*-----------Задание 6: Перебор Списка в Цикле---------------*/
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printListInt (int: List<Int>) {
    for (i in int) {
        println(i)
    }
}

/*-----------Задание 7: Получение Элементов Списка по Индексу---------------*/
//Создайте список строк и получите из него второй элемент, используя его индекс.
fun getSecondElement (arrayString: List<String>) {
    println(arrayString[1])
}

/*-----------Задание 8: Перезапись Элементов Списка по Индексу---------------*/
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
fun changeSecondIndex (listInt: MutableList<Int>, newValue: Int) {
    listInt[1] = newValue
        println(listInt)
}

/*-----------Задание 9: Объединение Двух Списков---------------*/
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
fun unificationList (firstList: List<String>, secondList: List<String>) {
    val newList: MutableList<String> = mutableListOf()
    for (i in firstList) {
        newList.add(i)
        }
        for (j in secondList) {
            newList.add(j)
        }
        println(newList)
}

/*-----------Задание 10: Нахождение Минимального/Максимального Элемента---------------*/
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
fun minMaxValue (list: List<Int>) {
    var minValue = list[0]
    var maxValue = list[0]
        for (i in list) {
            if (i < minValue) {
                minValue = i
            }
            if (i > maxValue) {
                maxValue = i
            }
    }
        println("Минимальное значение - $minValue, максимальное значение - $maxValue")
}

/*-----------Задание 11: Фильтрация Списка---------------*/
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
fun searchEvenAndOdd (list: List<Int>) {
    val newList: MutableList<Int> = mutableListOf()
        for (i in list) {
            when {
                i % 2 == 0 -> newList.add(i)
            }
        }
        println(newList)
}
