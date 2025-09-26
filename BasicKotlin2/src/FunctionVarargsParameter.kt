fun varargs(data: Array<String>){
    for(name in data){
        println(name)
    }
}

fun main() {
    varargs(data = arrayOf("user 1", "user 2", "user 3"))
}