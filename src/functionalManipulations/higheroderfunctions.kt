package functionalManipulations

data class Fish(var name: String)

fun main(args: Array<String>) {
    var myName: String = "ramiz"
    myName = myWith(myName) {
        capitalize()
    }
    println(myName)

    //try run higher order function: returns result of execution of lambda
    val fish = Fish("splashy")
    println(fish.run { name })

    //try apply: returns object on which it is applied, after applying the lambda
    val fish2 = Fish("splashy").apply { name = "sharky" }
    println(fish2.name)

    //try let: returns the copy of the changed object
    println(fish.let { it.name.capitalize() }
        .let { it + " fish" }
        .let { it.length}
        .let { it + 31 })
}

fun myWith(name: String, block: String.() -> String): String {
    return name.block()
}