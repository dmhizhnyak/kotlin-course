package com.dm.kotlincourse.lesson5

/*Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.*/

fun taskOne (initialIntensity: Double, ratio: Double?) {
    val estimatedIntensity: Double
    val displayRatio = ratio ?: 0.5
    val result = initialIntensity * displayRatio
    println(result)
}
fun taskTwo (costDelivery: Double?) {
    val ratio = 0.5
    val defaultCostDelivery = costDelivery ?: 50.0
    val result = defaultCostDelivery + (defaultCostDelivery / 100 * ratio)
    println(result)
}
fun taskThree (atmoHeight: Double?, density: Double?) {
    val a = atmoHeight ?: (throw Exception ("Нет показателей высоты атмосферного давления"))
    val b = density ?: (throw Exception ("Нет показателей плотности воздуха"))
    println("Высота атмосферы: $atmoHeight")
    println("Воздушное давление: $density")
}
fun main () {
    taskOne(4.0, null)
    taskTwo(null)
    taskThree(14.0, null)
}