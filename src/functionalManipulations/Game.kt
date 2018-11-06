package functionalmanipulations

enum class Directions {
    START, END, NORTH, SOUTH, EAST, WEST
}

class Game {
    var path = mutableListOf(Directions.START)

    val north: () -> Unit = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH); Unit}
    val east = {path.add(Directions.EAST); Unit}
    val west = {path.add(Directions.WEST); Unit}
    val end = {
        path.add(Directions.EAST)
        println("Game over: $path")
        path.clear()
    }

    fun move(where: () -> Unit) {
        where()
    }

    fun makeMove(command: String?) {
        when(command) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main(args: Array<String>) {
    val game = Game()
    do {
        println(game.path)
        print("Enter a direction: n/s/e/w:")
        val userInput = readLine()
        game.makeMove(userInput)
    } while (!userInput.isNullOrEmpty())
}