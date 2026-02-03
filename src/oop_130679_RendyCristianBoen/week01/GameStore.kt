package oop_130679_RendyCristianBoen.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 450000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }