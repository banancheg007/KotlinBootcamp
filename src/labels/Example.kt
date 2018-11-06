package labels

fun main(args: Array<String>) {
    loop1@ for(i in 1..25) {
        println("i is $i")
        for (j in 1..10) {
            println("j is $j")
            if (i > 10) {
                println("break executed")
                break
            }
        }
    }
    println("both loops are finished")
} 