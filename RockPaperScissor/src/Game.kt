import kotlin.random.Random

fun getGameChoice(options : Array<String>) = options[Random.nextInt(options.size)]

fun getUserChoice(options : Array<String>) : String {
    println("Please enter one of the following:")

    for( (idx, item) in options.withIndex()){
        println("$idx - $item")
    }
    val userOption = readLine()
    return if (validOption(userOption, options)) options[userOption!!.toInt()] else getUserChoice(options)

}

fun validOption(userOption: String?, options: Array<String>): Boolean {
    if(userOption.isNullOrEmpty())
        return false

    val num : Int
    try {
         num = userOption.toInt()
    } catch (e: NumberFormatException) {
        return false
    }


    return options.indices.any{ it == num }

}

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissor")
    val gameSelected = getGameChoice(options)
    val userSelected = getUserChoice(options)

    println("Game: $gameSelected vs User: $userSelected")

    printResult(gameSelected, userSelected)

}

fun printResult(gameSelected: String, userSelected: String) {
    val result : String
    if (gameSelected == userSelected)
        result = "Tie"

    else
        if ((userSelected == "Rock" && gameSelected == "Stone")
            || (userSelected == "Scissor" && gameSelected == "Paper")
            || (userSelected == "Paper" && gameSelected == "Stone"))
            result = "Win"
        else
            result = "Lose"

    println("User Result: $result")
}
