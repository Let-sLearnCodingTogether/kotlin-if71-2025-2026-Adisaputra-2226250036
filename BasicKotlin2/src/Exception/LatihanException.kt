package Exception

class NilaiTidakValidException(msg : String): Exception(msg)

fun validasiNilai(nilai : Int){
    if(nilai < 0 || nilai > 100) {
        throw NilaiTidakValidException("Nilai harus antara 0 hingga 100")
    }
    println("Nilai Berhasil di input${nilai}")
}

fun main() {
    try {
    validasiNilai(105)
    }catch (error : NilaiTidakValidException){
        println("Nilai Salah ${error.message}")
    }
}