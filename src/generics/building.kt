package generics
open class BaseBuildingMaterial() {
    open val numberNeeded: Int = 1
}
class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}
class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T : BaseBuildingMaterial>(val baseBuildingMaterial: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeed: Int = (baseMaterialsNeeded * baseBuildingMaterial.numberNeeded)

    fun build() {
        println("$actualMaterialsNeed ${baseBuildingMaterial::class.simpleName} required")
    }
}

fun addItem(building: Building<BaseBuildingMaterial>) {
    println("item added")
}

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
    addItem(building)
}