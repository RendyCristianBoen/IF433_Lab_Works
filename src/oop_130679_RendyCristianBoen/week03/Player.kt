package oop_130679_RendyCristianBoen.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= xp) return

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level UP! Selamat Berjuang Seukses😮😂")
        }

    }
}