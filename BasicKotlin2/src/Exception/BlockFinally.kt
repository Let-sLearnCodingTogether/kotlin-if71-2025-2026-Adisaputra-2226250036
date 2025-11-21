package Exception

fun validasiumur3(umur : Int): Int{
    if(umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    return  umur
}

fun main() {
    println("Start")
    try {
        validasiumur3(10)
        validasiumur3(-3)
    }catch (error : IllegalArgumentException){
        println("Error dengan message ${error.message}")
    }catch (error : ArithmeticException){
        println("Error pembagian dengan 0")
    }catch (error : Exception){
        println("Error Tidak Diketahui${error.message}")
    }finally {
        println("Message dari block finally")
    }
    println("Finish")
}