package oop_130679_RendyCristianBoen.week08

data class Address(val city: String?)
data class Customer(val address: Address?)
data class Order(val customer: Customer?)