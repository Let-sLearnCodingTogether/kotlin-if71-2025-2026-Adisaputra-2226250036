package nextOOP

interface SpaceVehicle{
    fun accelerate ()

    fun stop(){
        println("stop")
    }
}

class LightSpace : SpaceVehicle{
    override fun accelerate() {
        println("Accelerate")
    }

//opsinal
    override fun stop() {
        println("stop override")
    }

}

fun main() {
    val lightSpaceOne = LightSpace()

    lightSpaceOne.accelerate()
    lightSpaceOne.stop()
}