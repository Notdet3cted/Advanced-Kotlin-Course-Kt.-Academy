import org.junit.Assert
import org.junit.Test
import java.lang.IllegalArgumentException

class PlusAtTests {

    @Test
    fun `Simple plusAt tests`() {
        val list = listOf(1,2,3)
        assertIsThrowingIAE { list.plusAt(-1, 100) }
        assertIsThrowingIAE { list.plusAt(-100, 100) }
        assertIsThrowingIAE { list.plusAt(1000, 100) }
        Assert.assertEquals(listOf(100, 1, 2, 3), list.plusAt(0, 100))
        Assert.assertEquals(listOf(1, 100, 2, 3), list.plusAt(1, 100))
        Assert.assertEquals(listOf(1, 2, 3, 100), list.plusAt(3, 100))
    }

    private fun <T> assertIsThrowingIAE(f: () -> T) {
        try {
            f()
        } catch (r: IllegalArgumentException) {
            return
        }
        Assert.assertTrue(false)
    }
}