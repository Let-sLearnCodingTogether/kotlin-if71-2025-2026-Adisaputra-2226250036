package OOP

class UserProperties( val username : String){

}

class UserProfile(val username: String){}

val UserProfile.usernameUppercase : String
    get() = this.username.uppercase()

fun main() {
    val user1 = UserProfile("tom")
    println(user1.username)
    println(user1.usernameUppercase)
}
