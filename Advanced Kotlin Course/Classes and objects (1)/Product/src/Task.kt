fun product(iterable: Iterable<Int>): Int {
    var prod = 1
    for (i in iterable) {
        prod *= i
    }
    return prod
}

fun main() {
    print(listOf(1,2,3).product())
}