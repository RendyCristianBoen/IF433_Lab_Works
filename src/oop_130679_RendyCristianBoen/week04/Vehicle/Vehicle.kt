package oop_130679_RendyCristianBoen.week04.Vehicle

import java.security.Principal

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju lah terjang semuanya. kecepatan: $speed perumur hidup lu")
    }

    open fun honk(){
        println("haha haha")
    }
}