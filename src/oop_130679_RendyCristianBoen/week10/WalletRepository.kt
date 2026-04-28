package oop_130679_RendyCristianBoen.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun <T: Any> search(item: T): String {
        return "Searching for $item in repository..."
    }
}