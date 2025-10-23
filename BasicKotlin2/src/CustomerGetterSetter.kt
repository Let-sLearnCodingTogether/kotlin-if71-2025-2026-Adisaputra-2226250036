package OOP

class NilaiUjian(nilaiUts : Double){
    var nilaiUts : Double = nilaiUts
        get() = field * 0.1
        set(value){
            field = if(value < 0 ) 0.0 else value
        }
    val nilaiAkhir : Double
        get() = nilaiUts * 2
}

fun main() {
val nilaiMhs = NilaiUjian(80.3)
    println(nilaiMhs.nilaiUts)
    println(nilaiMhs.nilaiAkhir)

    nilaiMhs.nilaiUts = -20.00
    println(nilaiMhs.nilaiUts)

    nilaiMhs.nilaiUts = 80.5
    println(nilaiMhs.nilaiUts)

}