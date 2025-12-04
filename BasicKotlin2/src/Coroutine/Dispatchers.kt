package Coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch(Dispatchers.IO){
        println("Dispatchers.IO")
    }

    launch(Dispatchers.Default){
        println("Dispatchers.Default")
    }
    delay(5_000)

    println("Selesai")

}