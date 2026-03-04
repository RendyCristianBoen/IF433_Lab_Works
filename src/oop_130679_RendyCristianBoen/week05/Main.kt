package oop_130679_RendyCristianBoen.week05

fun main() {

    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Pak Budi"),
        Admin("Bu Sinta")
    )

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> pegawai.doAdminWork()
        }

        println("---------------")
    }

    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(5, 3)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    val ewallet = EWallet("Rendy", 50000.0)
    val creditCard = CreditCard("Rendy", 100000.0)

    val methods: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in methods) {

        method.processPayment(75000.0)

        if (method is EWallet) {
            println("Saldo kurang, melakukan top up...")
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }

        println("---------------")
    }
}