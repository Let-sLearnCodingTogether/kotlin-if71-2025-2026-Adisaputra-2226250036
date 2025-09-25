fun main() {
    val range = 0..1000
    val rangeChar = 'a'..'z'
    val rangeUntil = 1 until 10
    val rangeDownTo = 10 downTo 0

    println(range.count())
    println(range.contains(500))
    println(range.last)

    val range2 = 0..1000 step 2
    val range3 = 1000..0 step 5

    println(range2.first)
    println(range3.first)
    println(range2.toList()[6])
}