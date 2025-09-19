fun main() {
    val haridalamsatuminggu : Array<String> = arrayOf("Senin", "Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu")

    println("Jumlah hari : ${haridalamsatuminggu.size}")
    println("Hari Pertama : ${haridalamsatuminggu.first()}")
    println("Hari Terakhir : ${haridalamsatuminggu.last()}")
    haridalamsatuminggu[4] = "jum'at Barokah"
    println("${haridalamsatuminggu[4]}")
}