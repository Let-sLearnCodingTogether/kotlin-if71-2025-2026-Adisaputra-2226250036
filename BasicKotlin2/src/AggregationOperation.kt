fun main() {
    val ages : Array<Int> = arrayOf(25, 20, 23, 34)

    println("Sum  : ${ages.sum()}")
    println("Average  : ${ages.average()}")
    println("Max Or Null  : ${ages.maxOrNull()}")
    println("Min Or Null  : ${ages.minOrNull()}")
    println("Count  : ${ages.count()}")
}