import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun defaultSeparatorSolution() {
        Assert.assertEquals("A, B, C", joinStrings("A", "B", "C"))
    }

    @Test
    fun changingSeparatorSolution() {
        Assert.assertEquals("A.B.C", changeSeparator())
    }
}