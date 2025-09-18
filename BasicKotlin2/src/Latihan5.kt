fun main() {
    var totalBelanja : Double = 0.0

    println("Status Awal -> total Belanja :Rp ${totalBelanja}")
    totalBelanja += 3 * 25000
    println("Status Item A -> total Belanja :Rp ${totalBelanja}")
    totalBelanja += 2 * 15000
    println("Status Item A -> total Belanja :Rp ${totalBelanja}")
    totalBelanja -= 10000
    println("Status Item B -> total Belanja :Rp ${totalBelanja}")
    val biayaLayanan : Double = totalBelanja/100
    totalBelanja += biayaLayanan
    println("Status Item C -> total Belanja :Rp ${totalBelanja}")
    println("Diterima Biaya Layanan : Rp (${biayaLayanan}) -> Total Belanja ${totalBelanja}")
    println()
    println("======================================")
    println("Total Akhir yang harus dibayar ${totalBelanja}")
    println("======================================")
}