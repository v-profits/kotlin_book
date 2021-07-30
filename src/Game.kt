fun main() {
    val name = "Мадригал"
    var healthPoints = 89 // здоровье
    val isBlessed = true // благословенна
    val isImmortal = false // бессмертен

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
}
