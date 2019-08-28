data class RationalNumber(val numerator: Int, val denominator: Int)

fun main() {
    val r1 = RationalNumber(1,2)
    val r2 = RationalNumber(1,3)

    r1 + r2 == RationalNumber(2,3)
    r1 * r2 == RationalNumber(1,6)
}