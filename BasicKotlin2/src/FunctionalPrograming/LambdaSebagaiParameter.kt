package FunctionalPrograming

fun operatorOnNumbers(a: Int, b : Int, operation:(Int, Int)-> Unit){
    return operation(a, b)
}

fun main() {
    operatorOnNumbers(1,2){x, y -> println(x + y)}//print di dalam
    operatorOnNumbers(1,2){x, y -> x * y}
    operatorOnNumbers(1,2){x, y -> x - y}
}
