package oop_130679_RendyCristianBoen.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== APLIKASI SISTEM PEMINJAMAN BUKU ===")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("WARNING: Lama pinjam tidak boleh minus!")
        duration = 1
    }

    val loan = Loan(title, name, duration)

    val fine = loan.calculateFine()

    println("\n=== HASIL ===")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp $fine")

    if (fine > 0) {
        println("Anda terkena denda!")
    }

    scanner.close()
}