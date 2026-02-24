package oop_130679_RendyCristianBoen.week04.Vehicle

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

}