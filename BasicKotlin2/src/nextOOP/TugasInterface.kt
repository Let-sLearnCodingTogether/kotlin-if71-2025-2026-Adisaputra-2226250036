package nextOOP

interface Electronic{
    fun turnOff()
    fun turnOn()
    val brand : String
        get() = "Sanken"
    fun cleanDrive(){
        println("Membersihkan Debu Dari Perangkat $brand")
    }
}

class brand(override val brand: String) : Electronic{
    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }

    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }
}
class SmartLight(override val brand: String) : Electronic{
    override fun turnOff() {
        println("Kipas angin merek $brand1 berhenti")
    }

    override fun turnOn() {
        println("Kipas angin merek $brand1 berputar")
    }
    val brand1: String = "Saken"
}

fun main() {
    val brand1 = SmartLight(" ")
    brand1.turnOn()
    brand1.turnOff()
    brand1.cleanDrive()
}