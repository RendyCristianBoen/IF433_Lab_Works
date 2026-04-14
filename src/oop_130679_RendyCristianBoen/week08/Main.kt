package oop_130679_RendyCristianBoen.week08

fun main() {

    val order = Order(Customer(Address("Bandung")))
    val city = order.customer?.address?.city ?: "Unknown"
    println("City: $city")

    order.customer?.address?.city?.let {
        println("City with let: $it")
    }

    val mixedList: List<Any> = listOf("Hello", 123, "World", true)

    for (item in mixedList) {
        val str = item as? String
        println("String: $str")
    }
}