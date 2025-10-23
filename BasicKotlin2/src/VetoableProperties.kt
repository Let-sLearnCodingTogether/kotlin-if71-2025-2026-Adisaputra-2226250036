package OOP

import kotlin.properties.Delegates

class NilaiMahasiswa{
    var nilai : Float by Delegates.vetoable(0.0f){ property, oldValue, newValue ->
        if(newValue > 0.0f && newValue <= 100f){
            println("Nilai Berhasil Diubah")
            true
        }else{
            println("Nilai Harus Lebih Besar Dari 0 Lebih Kecil Dari 100")
            false
        }

    }
}

fun main() {
   val nilaiMhs = NilaiMahasiswa()

    nilaiMhs.nilai = -10f
    println(nilaiMhs.nilai)

    nilaiMhs.nilai = 80f
    println(nilaiMhs.nilai)
}