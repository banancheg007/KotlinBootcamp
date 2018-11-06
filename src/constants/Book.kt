package constants

const val MAX_NUM_BOOKS = 5
class Book(val title: String, val author: String) {
    companion object {
        const val BASE_URL = "https://www.mybooks.com"
    }

    fun canBorrow(alreadyBorrowed: Int) = alreadyBorrowed < MAX_NUM_BOOKS

    fun printUrl() {
        println("$BASE_URL/$title.html")
    }
}

fun main(args: Array<String>) {
    val book = Book("Hamlet", "Shakespeare")
    book.printUrl()
}