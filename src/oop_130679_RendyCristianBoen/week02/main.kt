package oop_130679_RendyCristianBoen.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (wajib 5 karakter): ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR Pendaftaran dibatalkan. NIM harus 5 karakter ye!")
    } else {
        print("Masukan Jurusan kamu: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukan Jurusan kamu: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan Ngawur cik, Pendaftarannya dibatalkan")
    }
}