fun main() {
    val mataKuliahwajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma Dan Struktur Data"
    )

    val mataKuliahPilihan: MutableList<String> = mutableListOf(
        "Kotlin",
        "Logika Fuzzy"
    )

    mataKuliahPilihan.add("Web 2")

    println(mataKuliahPilihan[0])
    println(mataKuliahPilihan[1])
    println(mataKuliahPilihan[2])

    mataKuliahPilihan.add(1, "Web 1")
    println(mataKuliahPilihan[1])


    mataKuliahPilihan.removeAt(1)
    println(mataKuliahPilihan)


    val matakuliah = mataKuliahPilihan + mataKuliahwajib
    println(matakuliah)
}