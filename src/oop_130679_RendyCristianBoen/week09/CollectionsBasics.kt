package oop_130679_RendyCristianBoen.week09

fun main() {

    val immutableList = listOf("Apple", "Banana", "Cherry")
    println("Immutable List: $immutableList")

    val mutableList = mutableListOf("Apple", "Banana", "Cherry")
    mutableList.add("Orange")
    mutableList.remove("Banana")

    println("Mutable List: $mutableList")
}