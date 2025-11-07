import kotlin.random.Random

/*fun main() {
    var n: Int
    do {
        print("Введите число больше 10: ")
        n = readln().toInt()
    } while (n <= 10)

    println("Спасибо! Вы ввели $n.")
}*/

/*fun main() {
    var pass: String?

    do {
        print("Введите пароль: ")
        pass = readln()
    } while (pass != "qwerty")

    println("Доступ разрешен!")
}*/

/*fun main() {
    for (i in 1..5) {
        println("Шаг $i")
    }
}*/

/*fun main() {
    val fruits = listOf("apple", "banana", "cherry")

    for (fruit in fruits) {
        println("Фрукт: $fruit")
    }
}*/

/*fun main() {
    val s = "Kotlin is awesome"
    val words = s.split(" ")
    println(words)
}*/

/*fun main() {
    val data = "apple,banana,cherry"
    val fruits = data.split(",")

    for (fruit in fruits) {
        println(fruit)
    }

    val messy = "word1,word2;word3|word4"
    val parts = messy.split(",", ";", "|")
    println(parts)

    val fullName = "Иванов Иван"
    val part = fullName.split(" ")
    val lastName = part[0]
    val firstName = part[1]
    println("Фамилия: $lastName, Имя: $firstName.")
}*/

/*fun main() {
    print("Введите числа через пробел: ")
    val input = readln()
    val nums = input.split(" ")
    var sum = 0

    for (n in nums) {
        sum += n.toInt()
    }
    println("Сумма чисел: $sum.")
}*/

/*fun main() {
    print("Введите первое число, знак операции и второе число через пробел: ")
    val input = readln().split(" ")

    val symbol = input[1]
    val firstN = input[0].toDouble()
    val secondN = input[2].toDouble()

    var res = 0.0

    when (symbol) {
        "/" -> res = firstN / secondN
        "*" -> res = firstN * secondN
        "+" -> res = firstN + secondN
        "-" -> res = firstN + secondN
        else -> println("Некорретный ввод")
    }
    println("$firstN $symbol $secondN = $res")
}*/

/*fun main() {
    val target = Random.nextInt(1,100)
    println("Угадай число от 1 до 100.")

    while (true) {
        print("Введи число: ")
        val input = readln().toInt()

        when {
            input < target -> println("Загаданное число больше.")
            input > target -> println("Загаданное число меньше.")
            else -> {
                println("Поздравляю! Ты угадал число: $target")
                break
            }
        }
    }
}*/

/*fun main() {
    val dice1 = Random.nextInt(1,7)
    val dice2 = Random.nextInt(1,7)
    val sum = dice1+ dice2

    println("Первый кубик: $dice1")
    println("Второй кубик: $dice2")
    println("Сумма: $sum")
}*/

/*fun main() {
    val num1 = Random.nextDouble(0.0, 10.0)
    val num2 = Random.nextDouble(0.0, 10.0)
    val num3 = Random.nextDouble(0.0, 10.0)

    val sum = (num1 + num2 + num3)
    println("Числа: $num1, $num2, $num3")
    println("Среднее: $sum")
}*/

/*fun main() {
    val part1 = arrayOf("Опытный", "Безумный", "Легендарный","Скрытый", "Гигачад")
    val part2 = arrayOf("стрелок", "геймер", "воин", "волшебник", "трейдер")
    val part3 = arrayOf("из CSGO", "на максималках", "из будущего", "в бане у Габена", "с проклятым лутом")

    val rand1 = (Math.random() * part1.size).toInt()
    val rand2 = (Math.random() * part1.size).toInt()
    val rand3 = (Math.random() * part1.size).toInt()

    val phrase = "${part1[rand1]} ${part2[rand2]} ${part3[rand3]}"
    println("Ваш титул: $phrase")
}*/