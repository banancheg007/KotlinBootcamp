package Aquarium

fun main(args: Array<String>){
    buildAquarium()
}

internal fun buildAquarium(){

    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}"+
            "Width: ${myAquarium.width}" +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium (20,15, 30)
    println("Small aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
}
