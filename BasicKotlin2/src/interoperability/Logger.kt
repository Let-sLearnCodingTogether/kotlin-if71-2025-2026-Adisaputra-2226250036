package interoperability

class Logger{
    @JvmOverloads
    fun log(message : String, level : String = "INFO"){
        println("[$level] $message")
    }
}