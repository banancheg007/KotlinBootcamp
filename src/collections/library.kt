package collections

fun main(args: Array<String>) {
    val immutableSet = setOf("Book1", "Hamlet", "Book3")
    val immutableLibrary = mapOf("Shakespeare" to immutableSet)
    println("Is any book hamlet ${immutableLibrary["Shakespeare"]?.any { it.contains("Hamlet") }}")

    val moreBooks = mutableMapOf("Hamlet" to "Shakespeare")
    println(moreBooks.getOrPut("Some Book") {"Ramiz Raja"})
}