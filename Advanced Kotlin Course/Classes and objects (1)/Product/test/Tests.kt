import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class Test {

    @Test
    fun check() {
        val prod = listOf(1,2,3,4,5).product()
        assertEquals(120, prod)
    }
}