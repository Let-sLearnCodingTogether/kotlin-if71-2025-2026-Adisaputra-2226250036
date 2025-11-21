package Exception

fun validasiumur2(umur : Int): Int{
    if(umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    return  umur/0
}

fun main() {
    println("Start")
    try {
        validasiumur2(10)
        validasiumur2(-3)
    }catch (error : IllegalArgumentException){
        println("Error dengan message ${error.message}")
    }catch (error : ArithmeticException){
        println("Error pembagian dengan 0")
    }catch (error : Exception){
        println("Error Tidak Diketahui${error.message}")
    }
    println("Finish")
}