package oop_130679_RendyCristianBoen.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}