fun main() {
    var number = 1
    while (number <= 10) {
        println("Число: $number")
        number++
        if (number == 3) {
            println("Останавливаемся на $number")
            continue
        }
    }
}