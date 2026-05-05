package oop_130679_RendyCristianBoen.week11

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.lowercase().replaceFirstChar { c -> c.uppercase() } }
}

fun String.reverseWords(): String {
    return this.split(" ").reversed().joinToString(" ")
}