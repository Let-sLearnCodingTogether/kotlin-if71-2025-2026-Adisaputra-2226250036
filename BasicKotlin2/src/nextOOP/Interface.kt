package nextOOP

interface Vehicle{
    fun accelerate()
    fun stop()
}

class motor : Vehicle{
    override fun accelerate() {
        println("accelerate")
    }

    override fun stop() {
        println("stop")
    }

}

fun main() {
    val motor1 = motor()
    motor1.accelerate()
    motor1.stop()
}