package oop_130679_RendyCristianBoen.week03

class Employee(val name: String) {
    private var performanceRating: Int = 3
    val tax: Double
        get() = salary * 0.1

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name Meningkat Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }


    var salary: Int = 0
        set(value) {
            if (value > 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}