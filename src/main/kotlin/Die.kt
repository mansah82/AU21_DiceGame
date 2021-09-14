class Die (var min: Int = 1, var max: Int) {

    fun roll() {
        var randomInteger = (1..6).shuffled().first()
        assert(true) { randomInteger >= 1 }
        assert(true) { randomInteger <= 6 }

        while (randomInteger != min) {
            println("try again")
            min = readLine()!!.toInt()
            if (randomInteger == min) {
                println("Great you guessed right")

            }

        }

    }
}

