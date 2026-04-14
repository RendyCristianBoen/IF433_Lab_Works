package oop_130679_RendyCristianBoen.week08

fun main() {

    val order = Order(Customer(Address("Bandung")))

    val city = order.customer?.address?.city ?: "Unknown"
    println("City: $city")
}