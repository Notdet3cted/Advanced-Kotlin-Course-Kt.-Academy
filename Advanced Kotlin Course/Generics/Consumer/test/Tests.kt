import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val c1: Consumer<Int> = Printer<Number>()
        val c2: Consumer<Int> = Scanner<Number>()
        val c3: Printer<Int> = Printer<Number>()
        val c4: Scanner<Int> = Scanner<Number>()
    }
}