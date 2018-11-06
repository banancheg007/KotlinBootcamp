package interfaceAndAbstractClass

fun main(args: Array<String>) {
    val spice = Curry("curry", "mild")
    spice.prepareSpice()
    spice.grind()
}

enum class Color(rgb: Int) {
    YELLOW(0xFFFF00),
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

interface SpiceColor {
    val color: Color
}

sealed class Spice(val name: String, val spiciness: String = "mild",
                   val spiceColor: SpiceColor): SpiceColor by spiceColor {
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

    override fun toString(): String {
        return "Spice name is $name, spiciness is $spiciness and heat is $heat"
    }
}

interface Grinder {
    fun grind()
}

object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
}

class Curry(name: String, spiciness: String, spiceColor: SpiceColor = YellowSpiceColor): Spice(name, spiciness, spiceColor), Grinder {
    override fun prepareSpice() {
        println("${name} spice prepared")
    }

    override fun grind() {
        println("${name} spice is grinded")
    }
}