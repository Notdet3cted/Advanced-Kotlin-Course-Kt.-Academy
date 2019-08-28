import org.junit.Test
import org.junit.Assert

class TestFib {

    @Test
    fun testFib() {
        Assert.assertEquals(0, fib(0))
        Assert.assertEquals(1, fib(1))
        Assert.assertEquals(1, fib(2))
        Assert.assertEquals(2, fib(3))
        Assert.assertEquals(3, fib(4))
        Assert.assertEquals(5, fib(5))
        Assert.assertEquals(8, fib(6))
        Assert.assertEquals(13, fib(7))
        Assert.assertEquals(21, fib(8))
        Assert.assertEquals(34, fib(9))
        Assert.assertEquals(55, fib(10))
        Assert.assertEquals(89, fib(11))
    }
}