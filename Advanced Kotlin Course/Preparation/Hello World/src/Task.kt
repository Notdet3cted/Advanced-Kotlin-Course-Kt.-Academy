fun helloWorld(): String = "Hello, World"

// This is how Hello World program looks like in Kotlin

fun main() {
    val list = listOf("A", "B", "C")
    for((i, elem) in list.withIndex()) {
        println("At $i there is $elem")
    }
}
