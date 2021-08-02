const val MAX_EXPERIENCE: Int = 5000

fun main() {
    println(message = { // вызов анонимной функции
        val currentYrar = 2018
        "Добро пожаловать в деревню Сим, мэр! (авторское право $currentYrar)"
    }.invoke())

    println({ // вызов анонимной функции
        val currentYrar = 2018
        "Добро пожаловать в деревню Сим, мэр! (авторское право $currentYrar)"
    }())

    //---
    val g: () -> Unit = { // вызов анонимной функции
        println("Добро пожаловать в деревню Сим, мэтр!")
    }
    g()

    val greetingFunction: () -> String = { // вызов анонимной функции
        val currentYear = 2019
        "Добро пожаловать в деревню Сим, мэтр! (авторское право $currentYear)"
    }
    println(greetingFunction())

    val greetingFunction_ = { // вызов анонимной функции
        val currentYear = 2019
        "Добро пожаловать в деревню Сим, мэтр! (авторское право $currentYear)"
    }
    println(greetingFunction_())

    //---

    val greetingFunction2: (String) -> String = { playerName ->
        val currentYear = 2020
        "Добро пожаловать в деревню Сим, $playerName! (авторское право $currentYear)"
    }
    println(greetingFunction2("парень"))

    val greetingFunction2_ = { playerName: String ->
        val currentYear = 2020
        "Добро пожаловать в деревню Сим, $playerName! (авторское право $currentYear)"
    }
    println(greetingFunction2_("парень"))

    //---

    val greetingFunction3: (String) -> String = {
        val currentYear = 2021
        "Добро пожаловать в деревню Сим, $it! (авторское право $currentYear)"
    }
    println(greetingFunction3("чувак"))

    //---

    val  greetingFunction4: (String, Int) -> String = { playerName, numBuildings ->
        val  currentYear = 2021
        println("Построено дополнительно домов: $numBuildings")
        "Добро пожаловать в деревню Сим, $playerName! (авторское право $currentYear)"
    }
    println(greetingFunction4("мэр",2))

    val  greetingFunction4_ = { playerName: String, numBuildings: Int ->
        val  currentYear = 2021
        println("Построено дополнительно домов: $numBuildings")
        "Добро пожаловать в деревню Сим, $playerName! (авторское право $currentYear)"
    }
    println(greetingFunction4_("мэр",2))

    //---

    val numL = "Missiissippi".count({ l ->
        l == 's'
    })
    println(numL)

    println("mississippi".count({it == 'p'}))

    println("mississippi".count{it == 'i'})

    //---
    /*
    val greenFun = { name: String, number: Int ->
        val year = 2021
        println("построено домов: $number")
        "добро пожаловать в деревню Сим, $name! (авторское право $year"
    }
    runSimul("Мэр",greenFun)
     */
    run("Мэр", ::prints) { name, num -> // код закомментированный выше с сокращениями
        val year = 2021
        println("построено домов: $num")
        "добро пожаловать в деревню Сим, $name! (авторское право $year"
    }
    //===
    run2()
}
fun run2(){
    val green = fn()
    println(green("Мэр"))
}

fun fn():(String)->String{
    val type="госпитали"
    var num=5
    return { name: String ->
        val year = 2018
        num += 1
        println("построили $type: $num")
        "добро пожаловать в деревню Сим, $name! (авторское право $year)"
    }
}
//===
/*
fun d(): String{
    TODO()
}*/
//===
fun prints(num: Int) {
    val cost = 500
    println("construction cost: ${cost * num}")
}

// inline функции скопирует и вставит тело функции туда, откуда произведен вызов для избежания потерь производительности
inline fun run(name: String,
                    fn2: (Int) -> Unit,
                    fn3: (String,Int) -> String) {
    val num = (1..3).shuffled().last() // случайно выберет 1, 2 или 3
    fn2(num)
    println(fn3(name, num))
}


