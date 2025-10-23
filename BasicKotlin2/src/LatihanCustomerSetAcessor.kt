package OOP

class Mahasiswa(ipk : Double){
    var ipk : Double = ipk
        set(value) {
            field = if(value < 0) 0.0 else if (value > 4.0) 4.0 else value
        }
}

fun main() {
    var ipk = Mahasiswa(2.0)
    println(ipk.ipk)

    ipk.ipk = 4.4
    println(ipk.ipk)

    ipk.ipk = -70.0
    println(ipk.ipk)

}