package oop_130679_RendyCristianBoen.week04.Vehicle

fun main(){
    println("---Testing Vehicle ---")
    val generalVehicle = Vehicle("Anak Introvet")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("INTROVET SET", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}