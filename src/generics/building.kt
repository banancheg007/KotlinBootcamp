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

inline fun <reified T: BaseBuildingMaterial> BaseBuildingMaterial.hasType() = this is T

class Building<out T : BaseBuildingMaterial>(val baseBuildingMaterial: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeed: Int = (baseMaterialsNeeded * baseBuildingMaterial.numberNeeded)

    fun build() {
        println("$actualMaterialsNeed ${baseBuildingMaterial::class.simpleName} required")
    }
}

inline fun <reified R: BaseBuildingMaterial> Building<*>.hasBaseBuildingMaterial() = baseBuildingMaterial is R

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeed < 500) {
        println("Building is small")
    } else {
        println("Building is large")
    }
}

fun addItem(building: Building<BaseBuildingMaterial>) {
    println("item added")
}

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
    println(building.baseBuildingMaterial.hasType<Wood>())
    println(building.hasBaseBuildingMaterial<Brick>())
    isSmallBuilding(building)
}