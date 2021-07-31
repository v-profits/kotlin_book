fun main() {

    val name = "Мадригал"
    val healthPoints = 89 // здоровье
    val isBlessed = true // благословенный
    val isImmortal = false // бессмертный

    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal) // цвет ауры

    // по числу здоровья и благословению апределяет состояние здоровья
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Состояние игрока
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    // появление чаши с огненным шаром
    castFireball()

    // shouldReturnAString() // функция не выполнится

    `пользователи должны выходить из системы при нажатии кнопки выход`()
}
fun `пользователи должны выходить из системы при нажатии кнопки выход`() {
    println("ключ: выход")
}

/*
fun shouldReturnAString(): String {
    TODO("реализуйте здесь функцию построения строк, чтобы возвращать строку")
    println(" ") // компилятор дальше не читает код
}
*/
private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
        if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE" // цвет ауры


private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
        when (healthPoints) { // состояние здоровья
            100 -> " в отличном состоянии!"
            in 90..100 -> " пара царапин"
            in 75..90 ->
                if (isBlessed) " имеет небольшие раны, но заживает довольно быстро!"
                else " слегка ранен"
            in 15..75 -> " выглядит тяжело раненным"
            else -> " в ужасном состоянии!"
        }

private fun castFireball(numFirebals: Int = 2) =
        println("Появляется чаш: $numFirebals \"Огненный Шар\"")

