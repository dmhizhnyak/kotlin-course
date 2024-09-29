package com.dm.kotlincourse.lesson8

/*fun main () {
    val stringOne = "Это простая строка"

    val firstName = "Илья"
    val lastName = "Петров"

    val age = 39
    val greeting = "Привет, меня зовут $firstName и мне $age"
    val person = Person(name = "Илья", age = 33)
    println("меня зовут ${person.name} и мне ${person.age}")
}

class Person (val name: String, val age: Int)
*/
/*fun main () {
    val originalString = "kotlin is fun"
    val subString = originalString.substring(3)
    val subString2 = originalString.subSequence(2, 6)
    val replaceString = originalString.replace("k", "W")
    val splitString = originalString.split(" ") //Преобразование в лист каждого слова
    val light = "Hello".length // Длина строки
    val upper = "hello".uppercase() //Верхний регистр
    val lower = "HELLO".lowercase() //Нижний регистр
    val trimmed = "  hello  ".trim() //Удаление пробелов, знаков, букв
    val starts = "Kotlin".startsWith("Kot") //Проверка начинается ли строка с заданного
    val ends = "Kotlin".endsWith("lin") //Аналогично только проверка конца строки
    val contains = "Hello".contains("ell") //Проверка на содержание
    val empty = "".isNullOrEmpty() //Проверка строки на пустоту
    val blank = "  ".isNullOrBlank() //Проверка строки на пустоту даже с пробелами
    val repeat = "ab".repeat(3) //Повторить строку 3 раза
    val letter = originalString[5] //Поиск по индексу
    val indexOfChar = "Kotlin".indexOf('t') //Поиск индекса
    val indexOfWord = "Kotlin is the best language".indexOf("best")
    val backReverse = "niltoK".reversed() // Перевернуть строку
    val multiLineString = """
    Первая строка
    Вторая строка
    Третья строка
""".trimIndent() //Между """   """ Содержимое строки

    println(letter)
}

fun main () {
    val name = "Алексей"
    val city = "Москва"
    val age = 32
    val friendsCount = 1052
    val rating = 4.948
    val balance = 2534.75856
    val text = """
   Имя: %s
   Город: %s
   Возраст: %d
   Количество друзей: %,d
   Рейтинг пользователя: %.1f
   Баланс счета: $%,.2f
""".trimIndent()
    println(text.format(name, city, age, friendsCount, rating, balance))
}
*/
fun main () {
    println(convert("Для завершения проекта важно"))
    subString1("Kotlin: The Fun Way to Learn Programming")
}
//"Kotlin: The Fun Way to Learn Programming"
fun convert (string: String): String {
    return when {
        string.startsWith("Ошибка", true) -> string.replace(oldValue = "Ошибка", newValue = "Небольшое недоразумение")
        string.endsWith("важно", ignoreCase = true) -> "$string ...но не критично"
        else -> " "
    }
}
fun subString1(string: String) {
    println(string.substring(8,19))
}