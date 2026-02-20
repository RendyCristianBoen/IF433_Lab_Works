package oop_130679_RendyCristianBoen.week03

fun main(){
    val e = Employee("Rendy")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus di bayar: ${e.tax}")
}

