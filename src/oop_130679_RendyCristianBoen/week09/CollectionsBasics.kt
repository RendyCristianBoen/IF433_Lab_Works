package oop_130679_RendyCristianBoen.week09

fun main() {

    val immutableList = listOf("Apple", "Banana", "Cherry")
    println("Immutable List: $immutableList")

    val mutableList = mutableListOf("Apple", "Banana", "Cherry")
    mutableList.add("Orange")
    mutableList.remove("Banana")

    println("Mutable List: $mutableList")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4) [cite: 31]
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB") [cite: 33]
    activeUsers.add("UserC") [cite: 34]
    activeUsers.add("UserA")
    println("Active Users: $activeUsers") [cite: 35]
}