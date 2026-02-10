package oop_130679_RendyCristianBoen.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1  // Default argument 1 hari
) {
    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    // Method untuk menampilkan detail peminjaman
    fun displayLoanDetails() {
        println("\n=== DETAIL PEMINJAMAN ===")
        println("Judul Buku    : $bookTitle")
        println("Peminjam      : $borrower")
        println("Lama Pinjam   : $loanDuration hari")
        println("Total Denda   : Rp ${calculateFine()}")
    }
}