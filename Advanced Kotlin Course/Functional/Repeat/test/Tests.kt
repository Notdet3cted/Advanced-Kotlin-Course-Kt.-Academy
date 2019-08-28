import org.junit.Assert
import org.junit.Test
import kotlin.repeat as `Implement it yourself`

class Test {

    @Test
    fun add3Str() {
        var str = ""
        repeat(3) { str += "A" }
        Assert.assertEquals("AAA", str)
    }

    @Test
    fun add3Int() {
        var i = 0
        repeat(3) { i++ }
        Assert.assertEquals(3, i)
    }

    @Test
    fun add0Int() {
        var i = 0
        repeat(0) { i++ }
        Assert.assertEquals(0, i)
    }
}