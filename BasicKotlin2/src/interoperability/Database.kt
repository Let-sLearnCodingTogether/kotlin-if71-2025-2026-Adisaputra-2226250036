package interoperability

class Database {
    companion object{
    @JvmStatic
    fun getConnectisonUrl(): String {
        return "db_connection_url"
    }
    }
}