package decorations

import interfaceAndAbstractClass.Curry
import interfaceAndAbstractClass.Spice

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun main(args: Array<String>) {
    val spiceContainers = listOf(
        SpiceContainer(Curry("curry", "mild")),
        SpiceContainer(Curry("murry", "extreme spicy"))
    )

    println(spiceContainers)

    val spiceContainer1 = SpiceContainer(Curry("curry", "mild"))
    val spiceContainer2 = spiceContainer1.copy()

    println(spiceContainer1 == spiceContainer2)

    val (spice) = spiceContainer1
    println(spice)
}