package com.dm.kotlincourse.lesson8

fun main () {
    replacement("Это невозможно выполнить за один день")
    addToEnd("Я не уверен в успехе этого проекта")
    disaster("Произошла катастрофа на сервере")
    noProblem("Этот код работает без проблем")
    oneWord("Привет")
    extraction("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    mask("1234 1234 5678 5674")
    replaceEmailAdress("username@example.com")
    extractFileName("C:/Пользователи/Документы/Папка/report.txt")
    abbreviation("Объектно-ориентированное программирование")
    upperString("Написать метод, который преобразует строку из нескольких слов в строку, где каждое слово начинается с заглавной буквы а все остальные - строчные.")
//    encrypt("Hello") В работе
    table(1..100)
}
/*-------------Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.---------------------------------*/
/*Если фраза содержит слово "невозможно":
Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".*/
fun replacement (string: String) {
    if (string.contains("невозможно", ignoreCase = true)) {
    println(string.replace(oldValue = "невозможно", newValue = "совершенно точно возможно, просто требует времени", ignoreCase = true))
    } else println(string)
}
/*Если фраза начинается с "Я не уверен":
Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".*/
fun addToEnd (string: String) {
    if (string.startsWith(prefix = "Я не уверен", ignoreCase = true)) {
        println("$string, но моя интуиция говорит об обратном")
    } else println(string)
}
/*Если фраза содержит слово "катастрофа":
Преобразование: Замените "катастрофа" на "интересное событие".*/
fun disaster (string: String) {
    if (string.contains("катастрофа", ignoreCase = true)) {
        println(string.replace("катастрофа", ignoreCase = true, newValue = "интересное событие"))
        } else println(string)
}
/*Если фраза заканчивается на "без проблем":
Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".*/
fun noProblem (string: String) {
    if (string.endsWith("без проблем", ignoreCase = true)) {
        println(string.replace(oldValue = "без проблем", ignoreCase = true, newValue = "с парой интересных вызовов на пути"))
    } else println(string)
}
/*Если фраза содержит только одно слово:
Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".*/
fun oneWord (string: String) {
    if (string.split(" ").size == 1) {
        println("Иногда $string, но не всегда")
    } else println(string)
}
/*Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.*/
fun extraction (string: String) {
    val newString = string.split(" -> ")[1]
    val date = newString.split(" ")[0]
    val time = newString.split(" ")[1]
    println("Дата входа $date, время: $time")
}
/*Задание 2: Маскирование Личных Данных
Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".*/
fun mask (string: String) {
    if ((string.split(" ").size == 4) && (string.length == 19)) {
        val listString = string.split(" ")[3]
        println("XXXX XXXX XXXX $listString")
    } else println("Не верно введен номер карты")
}
/*Задание 3: Форматирование Адреса Электронной Почты. Используй replace
Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".*/
fun replaceEmailAdress (string: String) {
    println(string.replace(oldValue = "@", newValue = " [at] ").replace(oldValue = ".", newValue = " [dot] "))
}
/*Задание 4: Извлечение Имени Файла из Пути
Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.*/
fun extractFileName (string: String) {
    val expansion = string.split("/").lastIndex
    println(string.split("/")[expansion].split(".")[0])
}
/*Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения. Используй for для перебора слов. Используй var переменную для накопления первых букв.
Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").*/
fun abbreviation (string: String) {
    var stringAbbreviate = ""
    val listString = string.split(" ", "-")
    for (i in listString) {
        stringAbbreviate += i[0]
    }
    println(stringAbbreviate.uppercase())
}
/*-------------------------------------------------Дополнительные задания-------------------------------------------------*/
/*1. Написать метод, который преобразует строку из нескольких слов в строку, где каждое слово начинается с заглавной буквы а все остальные - строчные. (можно использовать такой же подход как в задании 5, но накапливать не первые буквы а целиком слова, составленные из первой буквы с uppercase и оставшейся части слова)*/

fun upperString (string: String) {
    var stringAbbreviate = ""
    val listString = string.split(" ", " - ", ", ")
    for (i in listString) {
        stringAbbreviate += " ${i.replace(oldValue = i[0].toString(), newValue = i[0].uppercase())} "
    }
    println(stringAbbreviate)
}
/* 2. Написать шифратор/дешифратор для строки. Шифровка производится путём замены двух соседних букв между собой: Kotlin шифруется в oKltni. Дешифровка выполняется аналогично. Если длина строки - нечётная, в конец добавляется символ пробела до начала шифрования. Таким образом все шифрованные сообщения будут с чётной длинной. Должно получиться два публичных метода: encrypt() и decrypt() которые принимают и возвращают строку.*/
//fun encoder () {
//
//}
//fun encrypt (string: String) {
//    var encrypt = ""
//    val newString = string.split(" ")
//        for (i in newString) {
//            for (item in 0..i.length) {
//                var a = item
////                ++a
//                encrypt += "${i.replace(oldValue = i[1].toString(), newValue = i[0].toString(), ignoreCase = true)} "
//            }
//        }
//    println(encrypt)
//}
//fun decrypt (string: String) {
//
//}

/*Вывести таблицу умножения в консоль так, чтобы были ровные строки и столбцы. В заголовках столбцов и строк - числа для перемножения. В перекрестии - результат умножения. Каждый столбец должен быть выровнен по правому краю.
Для печати результата в той же строке использовать print()
Для перехода на следующую строку использовать println()
Для выравнивания использовать функции форматирования строк с шаблоном (%s)*/

fun table (range: IntRange) {
    for (i in range) {
        for (a in range) {
            when (range) {
                1..10 -> print("${String.format("%4s", i * a)} ")
                1..100 -> print("${String.format("%5s", i * a)} ")
            }
        }
        println()
    }
}