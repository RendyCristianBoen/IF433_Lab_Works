package oop_130679_RendyCristianBoen.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengajar.")
    }

    fun mengajar() {
        println("$nama memberikan materi kuliah.")
    }
}