package FunctionalPrograming

fun addPureFunction(a : Int, b : Int) : Int = a + b

var count = 0
fun addImpureFunction(a : Int ) : Int{
    count += 1
    return a+count
}

fun main() {
    println(addPureFunction(1,2))
    println(addPureFunction(1,2))
    println(addPureFunction(1,2))


    println(addImpureFunction(1))
    println(addImpureFunction(1))
}