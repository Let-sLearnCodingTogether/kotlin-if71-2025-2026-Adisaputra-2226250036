package Exception

fun validasiumur(umur : Int){
    if(umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    println("umur valid ${umur}")
}

fun main() {
    println("Start")
    validasiumur(10)
    validasiumur(-3)
    println("Finish")
}