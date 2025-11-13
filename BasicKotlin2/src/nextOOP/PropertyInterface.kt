package nextOOP

interface VehicleProperties{
    val weight : Int
    val name : String
        get() = "vehicle"
}

class Car : VehicleProperties{
    override val weight: Int = 1000
}

fun main() {
    val car1 = Car()

    println(car1.weight)
    println(car1.name)
}