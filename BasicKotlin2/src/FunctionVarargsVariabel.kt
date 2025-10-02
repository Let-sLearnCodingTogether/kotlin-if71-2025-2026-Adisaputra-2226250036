fun varargs1(firstName: String, vararg users: String){
    println(firstName)
    for(name in users){
        println(name)
    }
}

fun main() {
    varargs1("user 1", "user 2", "user 3")
}