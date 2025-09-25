fun main() {
    val finalexam = 'A'
    val nilailulus = arrayOf('A','B')

    when (finalexam) {
        'A' -> println("LULUS")
        'B' -> println("LULUS JUGA")
        'C' -> println("YA BISA LULUS")
        else -> println("TIDAK LULUS")
    }

    when (finalexam) {
        'A', 'B' -> println("LULUS")
        'C' -> println("YA BISA LULUS")
        else -> println("TIDAK LULUS")

    }

    when{
        finalexam == 'A' || finalexam == 'B'-> println("LULUS")
        finalexam == 'C' -> println("BISA LULUS")
        else -> println("Tidak Lulus")
    }

    var status = false

    when(finalexam){
        'A','B' -> status = true
        else -> status = false
    }
    println(status)

    var a = 10

    when{
        a < 12 ->{
            a += 2
            println(a)
        }
    }

    when(finalexam){
        in nilailulus -> println("Lulus")
        !in nilailulus -> println("Tidak Lulus")
    }

    when(finalexam){
        is Char -> println("ya, ini char")
        is String -> println("Ini String")
        !is Char -> println("bukan char")
    }
}
