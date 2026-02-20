package oop_130679_RendyCristianBoen.week03

fun main() {

    val player = Player("Rendy")
    player.addXp(50)
    player.addXp(60)

    val weapon = Weapon("Dragon Slayer")

    weapon.damage = -50
    weapon.damage = 9999

    println("Weapon Tier: ${weapon.tier}")
}