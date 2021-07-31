fun main() {

    val name = "Мадригал"
    val healthPoints = 50 // здоровье
    val isBlessed = true // благословенный
    val isImmortal = false // бессмертный

    //Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal // видна аура
    //val auraColor = if(auraVisible) "GREEN" else "NONE" // цвет ауры

    val healthStatus = when(healthPoints) { // состояние здоровья
        100 -> " в отличном состоянии!"
        in 90..100 -> " пара царапин"
        in 75..90 ->
            if(isBlessed) " имеет небольшие раны, но заживает довольно быстро!"
            else " слегка ранен"
        in 15..75 -> " выглядит тяжело раненным"
        else -> " в ужасном состоянии!"
    }

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    val auraColor = when(karma){
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "NONE"
    }
    val statusFormatString = "(HP)(A) -> H"
    // Состояние игрока
    /*
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
    */
    when(statusFormatString){
        in "(HP)(A) -> H" -> println("(HP: $healthPoints)(Aura: $auraColor) -> $healthStatus")
    }

    /*
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