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

    val value: Any = "Not Int"
    val number = value as? Int ?: 0
    println("Number: $number")

    try {
        val text: String? = null
        println(text!!.length)
    } catch (e: Exception) {
        println("Crash: ${e.message}")
    }

    try {
        val name: String? = null
        val result = requireNotNull(name) { "Name wajib ada!" }
        println(result)
    } catch (e: Exception) {
        println(e.message)
    }
}