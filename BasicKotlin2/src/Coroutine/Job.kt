package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi Dimulai")

    val job : Job = launch {
        updateVersion1()
    }

    println("Apakah Job Ini Selesai ? ${job.isCompleted}")
    println("Apakah Job Ini Berjalan ? ${job.isActive}")
    println("Apakah Job Ini Dibatalkan   ? ${job.isCancelled}")

    println("Aplikasi Sedang Digunakan")
}

suspend fun updateVersion1(){
    delay(5_000)
    println("Update Selesai")
}