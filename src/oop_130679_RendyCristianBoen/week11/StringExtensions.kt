package oop_130679_RendyCristianBoen.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// 'this' bisa bernilai null, jadi harus ditangani
fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}
