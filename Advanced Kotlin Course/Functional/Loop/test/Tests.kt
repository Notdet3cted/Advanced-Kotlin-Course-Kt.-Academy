import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        var i = 0
        var success = false
        try {
            loop {
                i++
                if (i == 1000) throw E()
            }
        } catch (e: E) {
            success = i == 1000
        }
        Assert.assertTrue(success)
    }

    class E: Throwable()
}