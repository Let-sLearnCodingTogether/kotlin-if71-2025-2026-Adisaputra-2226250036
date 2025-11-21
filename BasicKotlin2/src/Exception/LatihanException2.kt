package Exception

class Barang(
    var nama: String,
    var stok: Int
)
class StokhabisException(msg : String): Exception(msg)

fun beliBarang(barang : Barang, jumlahBeli : Int){
    if(jumlahBeli > barang.stok){
        throw StokhabisException("Gagal Beli ${barang.nama}.stok hanya sisa ${barang.stok}")
    }else {
        barang.stok -= jumlahBeli
        println("Berhasil membeli $jumlahBeli ${barang.nama}")
        println("Sisa Barang ${barang.stok}")
    }
}

fun main() {
    val barang = Barang("Laptop", 15)
    try {
        beliBarang(barang, 10)
    } catch (error: StokhabisException) {
        println("Terjadi error: ${error.message}")
    }
}
