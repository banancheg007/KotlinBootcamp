package functionalManipulations

fun main(args: Array<String>) {
    var name: String = "ramiz"
    name = myWith(name) {
        capitalize()
    }
    println(name)
}
fun myWith(name: String, block: String.() -> String): String {
    return name.block()
} 