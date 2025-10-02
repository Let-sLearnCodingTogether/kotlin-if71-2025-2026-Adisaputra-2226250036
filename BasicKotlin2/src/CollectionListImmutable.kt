fun main() {
    val mataKuliahwajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma Dan Struktur Data"
    )

    println("List MataKuliah Wajib : $mataKuliahwajib")
    println("Size List MataKuliah Wajib : ${mataKuliahwajib.size}")
    println("Index Pertama MataKuliah Wajib : ${mataKuliahwajib[0]}")

    val matakuliahUppercase = mataKuliahwajib.map {
        it.uppercase()
    }
    println("List MataKuliah Wajib UpperCase : $matakuliahUppercase")

    val matakuliahLebihDariNKarakter = mataKuliahwajib.filter {
        it.length > 10
    }

    println("Mata Kuliah Lebih Dari 10 Karakter : $matakuliahLebihDariNKarakter")
}