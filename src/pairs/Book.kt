package pairs

class Book(val title: String, val author: String, val year: Int) {
    fun getBasicInfo(): Pair<String, String> {
        return (title to author)
    }

    fun getFullInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {
    val book = Book("Hobbit", "JK Rollings", 2000)
    val (title, author, year) = book.getFullInfo()
    println("Here is your book $title written by $author in year $year")
}