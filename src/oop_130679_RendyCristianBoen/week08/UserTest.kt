package oop_130679_RendyCristianBoen.week08

fun runMockUnitTest() {

    println("Running Mock Unit Test...")

    val expectedResult = "SUCCESS"
    val actualResult: String? = null
    println("Test Result Length: ${actualResult!!.length}")

    if (actualResult == expectedResult) {
        println("Test Passed")
    } else {
        println("Test Failed")
    }
}