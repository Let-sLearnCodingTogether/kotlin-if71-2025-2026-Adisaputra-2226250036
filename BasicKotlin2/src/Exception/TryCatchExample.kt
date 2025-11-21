package Exception

fun validasiumur1(umur : Int){
    if(umur < 0){
            throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    println("umur valid ${umur}")
}

fun main() {
    println("Start")
   try {
       validasiumur1(10)
       validasiumur1(-3)
   }catch (error : IllegalArgumentException){
       println("Error dengan message ${error.message}")
   }
    println("Finish")
}