import kotlin.random.Random
//Задание 1
/*fun main() {
    val target = Random.nextInt(1,51)
    println("Угадай число от 1 до 50. ")

    while (true) {
        print("Попытка: ")
        val input = readln().toInt()

        when {
            input < target -> println("Число больше.")
            input > target -> println("Число меньше.")
            else -> {
                println("Поздравляю! Ты угадал число: $target")
                break
            }
        }
    }

}*/

//Задание 2
/*fun main() {
    print("Введите строку в которой встречаются слова с гласными буквами: ")
    val input = readln()
    val abc = "аеёиоуыэяюaieouy"
    var count = 0

    for (i in input.lowercase()) {
        if (i in abc) {
            count++
        }
    }
    println("Кол-во гласных букв: $count")
}*/

//Задание 3
/*fun main(){
    print("Введите число: ")
    val n = readln().toInt()

    for (i in n downTo 1){
        println(i)
    }
}*/

//Задание 4
/*fun main() {
    var pass = ""
    val lenght = Random.nextInt(8,17)
    val abc = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!#$%&'()*+,-./:;<=>?@[]^_{|}~"

    for (i in 0 until lenght) {
        pass += abc[Random.nextInt(abc.length)]
    }

    println("Ваш пароль: $pass")
}*/

//Задание 5
/*fun main() {
    print("Введите ваше имя: ")
    val name = readln()
    print("Введите ваше любимое хобби: ")
    val hobbi = readln()
    print("Введите свой любимый цвет: ")
    val color = readln()
    print("Введите любимую марку машины: ")
    val car = readln()

    val otzif = listOf("Ты крутой!", "Хорошая работа!", "Продолжай в том же духе!", "Молодец!")
    val otzifv = otzif[Random.nextInt(otzif.size)]

    println("===== Результаты опроса =====")
    println("Вас зовут: $name")
    println("Ответы: $hobbi, $color, $car")
    println("Отзыв: $otzifv")
}*/

//Задание 6
/*fun main(){
    print("Введите число: ")
    val n = readln().toInt()
    var sum = 0

    for (i in 1..n){
        sum += i
    }
    println("Сумма чисел от 1 до $n: $sum")
}*/

//Задание 7
/*fun main() {
    var sum = 0
    for (i in 1..10){
        val dice = Random.nextInt(1,6)
        sum += dice
        println("Бросок $i кубика: $dice.")
    }
    println(sum)
}*/

//Задание 8
/*fun main(){
    val dice1 = Random.nextInt(1,6)
    val dice2 = Random.nextInt(1,6)
    val dice3 = Random.nextInt(1,6)

    println("Результат после прокрута: $dice1, $dice2, $dice3")

    if (dice1 == dice2 && dice2 == dice3) {
        println("Джекпот!")
    }
}*/

//Задание 9
/*fun main(){
    var balance = Random.nextInt(100,1001)
    var day = 1

    println("Баланс: $balance RUB.")

    while (balance > 0) {
        val vichet = Random.nextInt(10,101)
        if (vichet > balance) {
            println("День = $day, вывод = $vichet RUB, Осталось = $balance")
            break

        }
        balance -= vichet
        println("День = $day, вывод = $vichet RUB, Осталось = $balance")
        day++
    }
}*/

//Задание 10
/*fun main() {
    val days = listOf("ПН","ВТ","СР","ЧТ","ПТ","СБ","ВС")
    var cold = ""

    for (i in days){
        val temp = Random.nextInt(-10,31)
        if (temp < 0) {
            cold += "- $i: $temp°C\n"
        }
    }
    println("Дни, когда температура была ниже нуля:")
    if (cold.isNotEmpty()){
        print(cold)
    } else {
        println("Такие дней нет.")
    }
}*/