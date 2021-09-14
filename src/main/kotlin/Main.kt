fun main(args: Array<String>) {
    var players: Player("", 43)
    val listOfPlayers = mutableListOf<Player>()
    val addPlayer = readLine().toString()




    println("How many sides do you want your dice to be? write in number")
    var howManySides = readLine()!!.toInt()
    println("Guess a number")
    var dashDice = readLine()!!.toInt()
        val diceRandom = Die(dashDice, howManySides)
        (diceRandom.roll())





}



