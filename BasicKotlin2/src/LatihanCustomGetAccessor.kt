package OOP

class persegiPanjang (val Panjang :Double, val Lebar: Double){
    val Luas : Double
        get() = Panjang * Lebar
}

fun main() {
    val LuasPersegiPanjang = persegiPanjang(7.0, 8.0)
    println(LuasPersegiPanjang.Luas)
}