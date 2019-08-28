fun biggest(a: Int, b: Int, c: Int) = when {
    a > b && a > c -> a
    b > c -> b
    else -> c
}