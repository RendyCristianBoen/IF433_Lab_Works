package oop_130679_RendyCristianBoen.week04.Vehicle

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Anak Introvet")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("INTROVET SET", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("INTROVET LISTRIK", 4, 85)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Bos Introvet", 10_000_000)
    val developer = Developer("Coder Introvet", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}