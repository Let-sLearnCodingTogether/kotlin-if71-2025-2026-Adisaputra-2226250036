package nextOOP

interface moveA{
    fun move(){
        println("Move A")
    }
}
interface moveB{
    fun move(){
        println("Move B")
    }
}

class Human : moveA, moveB{
    override fun move() {
        super<moveA>.move()
        super<moveB>.move()
    }
}

fun main() {
    val human1 = Human()
    human1.move()
}

