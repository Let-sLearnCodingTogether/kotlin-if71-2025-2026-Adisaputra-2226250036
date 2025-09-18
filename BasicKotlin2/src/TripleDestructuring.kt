fun main() {
    val firstUser : Triple<String, Int, Boolean> = Triple("user 1", 20, false)

    val (username, age, marriage) = firstUser

    println(username)
    println(age)
    println(marriage)
}