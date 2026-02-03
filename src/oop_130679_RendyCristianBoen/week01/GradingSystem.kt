package oop_130679_RendyCristianBoen.week01

fun main() {
    val name = "Rendy Crsitian"
    val score = 80
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    println("Nama: $name, Nilai: $score")
}