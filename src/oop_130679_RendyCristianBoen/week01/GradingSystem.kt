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

    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null

    val idlength = studentId?.length ?: 0

    println("Panjang Id: $idlength")
}

fun calculateStatus(score: Int)= if (score > 75) "Lulus" else "Tidak Lulus"