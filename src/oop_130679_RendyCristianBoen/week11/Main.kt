package oop_130679_RendyCristianBoen.week11

fun main() {
    val text = "hello world kotlin"
    println(text.toTitleCase())
    println(text.reverseWords())

    val nullableText: String? = null
    println(nullableText.safeLength())
}