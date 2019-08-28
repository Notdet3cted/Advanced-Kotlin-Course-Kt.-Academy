import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun fizzBuzzFirstTest() {
//        printed = ""
        fizzBuzz()
//        Assert.assertEquals("1", printed.take(1))
    }
    @Test
    fun fizzBuzzThreeTest() {
        printed = ""
        fizzBuzz()
        Assert.assertEquals("12Fizz", printed.take(6))
    }
    @Test
    fun fizzBuzzFiveTest() {
        printed = ""
        fizzBuzz()
        Assert.assertEquals("12Fizz4Buzz", printed.take(11))
    }
    @Test
    fun fizzBuzzLongTest() {
        printed = ""
        fizzBuzz()
        val solution = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz"
        Assert.assertEquals(solution, printed.trim())
    }
}