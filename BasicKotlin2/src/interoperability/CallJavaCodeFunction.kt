package interoperability

fun main() {
    val user1 = UserClass()
    user1.name = "Adi[User]"

    println(user1.name)


    val user2 = CounterClass()

    user2.increment()

    println(user2.number)
}