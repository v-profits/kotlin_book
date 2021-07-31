fun main() {
    println(1 in 1..3) // res0: kotlin.Boolean = true
    println("${(1..3).toList()}") // res1: kotlin.collections.List<kotlin.Int> = [1, 2, 3]
    println(1 in 3 downTo 1) // res2: kotlin.Boolean = true
    println(1 in 1 until 3) // res3: kotlin.Boolean = true
    println(3 in 1 until 3) // res4: kotlin.Boolean = false
    println(2 in 1..3) // res5: kotlin.Boolean = true
    println(2 !in 1..3) // res6: kotlin.Boolean = false
    println('x' in 'a'..'z') // res7: kotlin.Boolean = true
    /*
    val name = "Мадригал"
    var healthPoints = 89 // здоровье
    val isBlessed = true // благословенный
    val isImmortal = false // бессмертный

    //Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal // видна аура
    val auraColor = if(auraVisible) "GREEN" else "NONE" // цвет ауры

    val healthStatus = when(healthPoints) { // состояние здоровья
        100 -> " в отличном состоянии!"
        in 90..100 -> " пара царапин"
        in 75..90 ->
            if(isBlessed) " имеет небольшие раны, но заживает довольно быстро!"
            else " слегка ранен"
        in 15..75 -> " выглядит тяжело раненным"
        else -> " в ужасном состоянии!"
    }
    // Состояние игрока
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

    val race = "gnome" // выдуманная расса
    val faction = when (race) { // фракции рассы
        "dwarf" -> "Хранители шахт"
        "gnome" -> "Хранители шахт"
        "orc" -> "Свободные люди с холмов"
        "human" -> "Свободные люди с холмов"
        else -> ""
    }
    */

}
