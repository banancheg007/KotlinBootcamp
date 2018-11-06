package interfaceAndAbstractClass

fun main(args: Array<String>) {
    val spice = Curry("mild")
    spice.prepareSpice()
    spice.grind()
}

abstract class Spice(val name: String, val spiciness: String = "mild") {
    abstract fun prepareSpice()

    val heat : Int
        get() = when (spiciness) {
            "no spice" -> 0
            "mild" -> 5
            "spicy" -> 6
            "very spicy" -> 7
            "extreme spicy" -> 8
            else -> 0
        }

    //called after primary constructor and before any secondary
    //constructor
    init {
//        println("Spice name is $name, spiciness is $spiciness and heat is $heat")
    }

    override fun toString(): String {
        return "Spice name is $name, spiciness is $spiciness and heat is $heat"
    }
}

interface Grinder {
    fun grind()
}

class Curry(spiciness: String): Spice("curry", spiciness), Grinder {
    override fun prepareSpice() {
        println("${name} spice prepared")
    }

    override fun grind() {
        println("${name} spice is grinded")
    }
}