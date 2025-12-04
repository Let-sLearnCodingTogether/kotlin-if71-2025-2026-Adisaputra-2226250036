package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi Dimulai")

    val job : Job = launch {
        updateVersion3()
    }

    println("Apakah Job Ini Selesai ? ${job.isCompleted}")
    println("Apakah Job Ini Berjalan ? ${job.isActive}")
    println("Apakah Job Ini Dibatalkan   ? ${job.isCancelled}")

    job.cancel()
    job.join()

    println("Aplikasi Sedang Digunakan")

    println("Apakah Job Ini Selesai ? ${job.isCompleted}")
    println("Apakah Job Ini Berjalan ? ${job.isActive}")
    println("Apakah Job Ini Dibatalkan   ? ${job.isCancelled}")
}

suspend fun updateVersion3(){
    delay(5_000)
    println("Update Selesai")
}