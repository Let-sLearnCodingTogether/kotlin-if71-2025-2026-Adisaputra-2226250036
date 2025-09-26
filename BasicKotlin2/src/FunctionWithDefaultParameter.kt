fun sayHello1(firstName : String, lastName : String = ""){
    println("Hellow, $firstName $lastName")
}

fun main() {
    sayHello1("Adi","Saputra")
    sayHello1("Ani")
}