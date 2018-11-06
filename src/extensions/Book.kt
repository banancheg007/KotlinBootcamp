package extensions

import java.util.*
import kotlin.math.max
import kotlin.math.min
class Book(val title: String, val author: String, var pages: Int = 250) {
}
//extension functions
fun Book.weight() = pages * 1.5
fun Book.tornPages(tornPages: Int) {
    if (pages >= tornPages) pages -= tornPages else pages = 0
}
class Puppy(val book: Book) {
    fun playWithBook() {
        val tornPagesCount = Random().nextInt(min(book.pages + 1, 50))
        book.tornPages(tornPagesCount)
        println("Puppy torned pages $tornPagesCount, remaining pages are ${book.pages}")
    }
}
fun main(args: Array<String>) {
    val book = Book("Hamlet", "Shakespeare")
    val puppy = Puppy(book)
    println("Book weight is ${book.weight()}")
    while (book.pages > 0) {
        puppy.playWithBook()
        println("Book weight is ${book.weight()}")
    }
}