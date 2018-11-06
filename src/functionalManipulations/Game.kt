package functionalManipulations

enum class Directions {
    START, END, NORTH, SOUTH, EAST, WEST
}
class Game {
    var path = mutableListOf(Directions.START)
    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {
        path.add(Directions.EAST)
        println("Game over: $path")
        path.clear()
        false
    }
}
fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
} 