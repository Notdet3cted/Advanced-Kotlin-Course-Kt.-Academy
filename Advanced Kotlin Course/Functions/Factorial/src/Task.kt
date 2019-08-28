fun factorial(n: Int): Long = when {
    n <= 1 -> 1
    else -> n * factorial(n - 1)
}