import org.junit.Assert.assertTrue
import org.junit.Test

class OperationsTest {

    @Test
    fun check() {
        val r1 = RationalNumber(1, 2)
        val r2 = RationalNumber(1, 3)

        assertTrue(r1 + r2 == RationalNumber(2, 3))
        assertTrue(r1 * r2 == RationalNumber(1, 6))
    }
}