package oop_130679_RendyCristianBoen.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (wajib 5 karakte): ")
    val nim = scanner.nextLine()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR Pendaftaran dibatalkan. NIM harus 5 karakter ye!")
    } else {
        print("Masukan Jurusan kamu: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}