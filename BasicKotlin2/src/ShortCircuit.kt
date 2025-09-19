fun main() {
    val isLoggedIn = true

    if(isLoggedIn ||(5 / 0 == 0)){
        println("User has access")
    }else{
        println("Access denied")
    }
}