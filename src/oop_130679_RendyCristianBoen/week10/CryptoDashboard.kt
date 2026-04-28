package oop_130679_RendyCristianBoen.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    response.data.forEach {
        println(it)
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX01", 50.0))
    txRepo.add(Transaction("TX02", 150.0))
}