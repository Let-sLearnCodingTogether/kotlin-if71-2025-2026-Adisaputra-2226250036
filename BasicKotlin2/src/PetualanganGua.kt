fun main() {
    println("Nama Pemain : ")
    val namaPemain = readln()

    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2
    var sedangBermain = true

    while (sedangBermain) {
        println("\n--- Status Saat Ini ---")
        println("Nama: $namaPemain")
        println("Kesehatan: $kesehatanPemain")
        println("Sisa Potion: $jumlahPotion")
        println("----------------------")


        println("\nDidepan kamu terdapat 2 buah jalur:")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur (1 atau 2): ")
        val pilihanJalur : String = readln()

        if (pilihanJalur == "1") {
            println("\nKamu memasuki ruangan dengan 3 patung.")
            print("Patung mana yang kamu pilih? (naga/griffin/ular): ")
            val pilihanPatung = readln()

            when (pilihanPatung) {
                "naga" -> {
                    println("Patung naga tiba-tiba mengeluarkan api ")
                    kesehatanPemain -= 35
                    println("Kesehatanmu berkurang 35 poin.")
                }
                "griffin" -> {
                    println("Patung griffin bergeser dan sebuah peti kecil terbuka. Kamu menemukan sebuah kunci emas di dalamnya")
                    punyaKunciEmas = true
                }
                "ular" -> {
                    println("Patung ular bergerak dan menggigit ")
                    kesehatanPemain -= 15
                    println("Kesehatanmu berkurang 15 poin.")
                }
                else -> {
                    println("Tidak ada yang terjadi.")
                }
            }

            if (jumlahPotion > 0 && kesehatanPemain < 100) {
                print("Kesehatanmu saat ini $kesehatanPemain. Mau menggunakan potion untuk memulihkan diri? (y/t): ")
                val pakaiPotion = readln()
                if (pakaiPotion == "y") {
                    jumlahPotion--
                    val tambahanKesehatan = 10
                    kesehatanPemain = (kesehatanPemain + tambahanKesehatan)
                    println("Kamu meminum potion. Kesehatanmu bertambah $tambahanKesehatan poin.")
                    println("Kesehatanmu sekarang $kesehatanPemain. Sisa potion: $jumlahPotion.")
                }
            }

            println("\nKamu menemukan sebuah pintu besar di ujung ruangan.")
            if (punyaKunciEmas) {
                println("Kamu menggunakan kunci emas untuk membuka pintu. Pintu terbuka, memperlihatkan sebuah ruangan berisi artefak kuno berkilauan! 🎉")
                println("Selamat! Kamu berhasil menyelesaikan petualangan ini!")
                sedangBermain = false
            } else {
                println("Pintu terkunci. Kamu tidak memiliki kunci emas. Kamu terjebak dan petualanganmu berakhir di sini.")
                sedangBermain = false
            }

        } else if (pilihanJalur == "2") {
            println("Kamu menginjak perangkap, jatuh dan terluka.")
            kesehatanPemain -= 25
            println("Kesehatanmu berkurang 25 poin.")
        } else {
            println("Pilihan tidak valid")
        }
    }
    println("\n--- Permainan Selesai ---")
}