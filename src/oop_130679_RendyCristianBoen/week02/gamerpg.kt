package oop_130679_RendyCristianBoen.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    println("MINI RPG BATTLE")
    println("================")

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan damage Hero: ")
    val heroDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, heroDamage)

    println("\nHero dibuat: $heroName")
    println("HP: ${hero.hp}, Damage: ${hero.baseDamage}")

    var enemyHp = 100
    val enemyName = "Goblin"

    println("\nMusuh: $enemyName")
    println("HP: $enemyHp")
    println("\n" + "-".repeat(30))

    var battle = true
    var round = 1

    while (battle && hero.isAlive() && enemyHp > 0) {
        println("\nRONDE $round")
        println("HP $heroName: ${hero.hp}")
        println("HP $enemyName: $enemyHp")
        println("\nAksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val pilih = scanner.nextInt()

        if (pilih == 1) {
            println("\n$heroName menyerang $enemyName!")
            enemyHp -= hero.baseDamage

            if (enemyHp <= 0) {
                enemyHp = 0
                println("$enemyName kena damage ${hero.baseDamage}")
                println("$enemyName mati!")
                battle = false
            } else {
                println("$enemyName kena damage ${hero.baseDamage}")
                println("HP $enemyName sisa: $enemyHp")

                println("\n$enemyName balas menyerang!")
                val enemyDamage = Random.nextInt(10, 21)
                hero.takeDamage(enemyDamage)
                println("$heroName kena damage $enemyDamage")
                println("HP $heroName sisa: ${hero.hp}")

                if (!hero.isAlive()) {
                    println("$heroName mati!")
                    battle = false
                }
            }
        } else if (pilih == 2) {
            println("\n$heroName kabur dari pertempuran!")
            battle = false
        } else {
            println("Pilihan salah!")
        }

        round++
    }

    println("\n" + "=".repeat(30))
    println("HASIL PERTEMPURAN")
    println("=".repeat(30))

    if (!hero.isAlive()) {
        println("KAMU KALAH!")
        println("$heroName gugur.")
    } else if (enemyHp <= 0) {
        println("KAMU MENANG!")
        println("$heroName menang dengan HP sisa: ${hero.hp}")
    } else {
        println("KABUR!")
        println("$heroName berhasil kabur.")
    }

    println("\nStatistik:")
    println("Nama Hero: $heroName")
    println("HP akhir: ${hero.hp}")
    println("HP musuh akhir: $enemyHp")

    scanner.close()
}