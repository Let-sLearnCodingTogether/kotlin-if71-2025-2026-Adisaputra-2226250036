package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    println("Aplikasi dimulai")

    println("Pindah halaman dari login, ke home")
}

suspend fun login(){
    println("Melakukan validasi email & password")
    delay(2_000)
    println("Validasi sukses")
}