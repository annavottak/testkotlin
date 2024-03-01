//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите число в метрах:")
    try {
        val meter = readln().toDouble()
        println("Это ${meter / 1000} км")
    } catch (e: Exception) {
        println("Неверные вводные данные")
    }
}