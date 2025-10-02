fun main() {
    val ages : Array<Int> = arrayOf(60, 25, 30, 40, 50)

    println("Ages : ${ages.joinToString()}")

    ages.sort()
    println("Age sort : ${ages.joinToString()}")

    ages.sortDescending()
    println("Age Descending : ${ages.joinToString()}")

    ages.sorted()
    println("Age sorted : ${ages.joinToString()}")

    ages.reverse()
    println("Age reverse : ${ages.joinToString()}")

    println("Slice : ${ages.slice(2..4).joinToString()}")
}