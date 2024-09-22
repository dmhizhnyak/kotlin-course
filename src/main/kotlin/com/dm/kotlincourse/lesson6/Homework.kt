package com.dm.kotlincourse.lesson6

fun main () {
    season(3)
    calculatingAgeOfADog(3.5)
    typeOfTranssport(77.9)
    calculationOfBonusPoints(1800)
    typeDocument("xls")
    convertTemperature(700, 'F')
    clothesToWeather(16)
    changeFilm(19)
}
/*----------------------------------------------------------------------------------*/
//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.

fun season (month: Int) {
    when (month) {
        in 1..2, 12 -> println ("winter")
        in 3..5 -> println ("spring")
        in 6..8 -> println ("summer")
        in 9..11 -> println ("autumn")
        else -> {
            println("Неверные данные")
        }
    }
}
/*----------------------------------------------------------------------------------*/
//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.

fun calculatingAgeOfADog (ageDog: Double) {
    var ageOnDogYear: Double = ageDog
    if (ageDog>=1 && ageDog<2) {
        ageOnDogYear = ageDog * 10.5
        println ("$ageOnDogYear")
    } else if (ageDog>=2) {
        ageOnDogYear = ageDog*4
        println ("$ageOnDogYear")
    } else {
        println ("$ageOnDogYear")
    }
}
/*----------------------------------------------------------------------------------*/
//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

fun typeOfTranssport (length: Double) {
    when {
        length in 0.0..0.9 -> println("Пешком")
        length in 1.0..4.9 -> println("Велосипед")
        (length > 5.0) -> println("Автотранспорт")
    }
}
/*----------------------------------------------------------------------------------*/
//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

fun calculationOfBonusPoints (purchaseAmount: Int) {
    if (purchaseAmount<1000) {
        val bonusPoints = purchaseAmount/100 * 2
        println("$bonusPoints")
    } else if (purchaseAmount>=1000) {
        val bonusPoints = ((purchaseAmount - 1000)/100 * 5) + (1000/100*2)
        println("$bonusPoints")
    } else {
        println("Неверные данные")
    }
}
/*----------------------------------------------------------------------------------*/
//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun typeDocument (doc: String) {
    when (doc) {
        "txt", "doc", "rtf" -> println("Текстовый документ")
        "jpg", "bmp", "png" -> println("Изображение")
        "xls", "xlsm", "xlt" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}
/*----------------------------------------------------------------------------------*/
//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шаблон “$result F” для фаренгейта или “$result C” для цельсия

fun convertTemperature (degree: Int, celsiusOrFahrenheit: Char) {
    if (celsiusOrFahrenheit == 'F') {
        val resault: Double
        resault = (degree-32)/1.8
        println("$resault")
    } else if (celsiusOrFahrenheit == 'C') {
        val resault: Double
        resault = degree * 1.8 + 32
        println("$resault")
    } else {
        println("Неверные данные")
    }
}
/*----------------------------------------------------------------------------------*/
//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

fun clothesToWeather (degree: Int) {
    when {
        degree<-30 || degree>35 -> println("Рекомендуется не выходить из дома")
        degree<0 -> println("Куртка и шапка")
        degree in 0..15 -> println("Ветровка")
        degree>15 -> println("Футболка и шорты")
    }
}
/*----------------------------------------------------------------------------------*/
//Задание 8: "Выбор Фильма по Возрасту"
//Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".

fun changeFilm (age: Int) {
    when  {
        age in 0..6 -> println("Три кота, Мешок яблок, Волшебное кольцо, Ну погоди")
        age in 6..12 -> println("Маленький принц, Тоботы, Поросенок, Фиксики")
        age in 12..16 -> println("Назад в будущее, Властелин колец, Один дома, Гарри Поттер")
        age in 16..18 -> println("Чудо, Волна, Книга Генри")
        age>18 -> println("Зеленая книга, Веном, Чужой, Собиратель душ, Достать ножи")
        else -> println("Неверные данные")
    }
}
/*----------------------------------------------------------------------------------*/


