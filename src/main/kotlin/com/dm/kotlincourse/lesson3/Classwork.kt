package com.dm.kotlincourse.lesson3

val userName: String = "Bob" // Константа

var age: Int = 37 // Переменная

const val PI: Double = 3.14 // Неизменяемая переменная, значение которой задается на этапе компиляции, должна быть примитивным типом

lateinit var userInfo: String // Только var, должна быть объявлена до первого использования. Используется только для не примитивных типов - объекты классов

var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value>=0) field=value
    }

