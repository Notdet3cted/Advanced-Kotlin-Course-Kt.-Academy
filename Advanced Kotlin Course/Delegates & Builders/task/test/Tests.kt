import org.junit.Test
import kotlin.system.measureTimeMillis

class Test {
    @Test
    fun `I don't have to wait if I changed value first`() {
        val time = measureTimeMillis {
            var game: Game? by mutableLazy { readGameFromSave() }
            game = Game()
            game
        }
        assert(time in 0..100)
    }

    @Test
    fun `I have to wait if I changed value first`() {
        val time = measureTimeMillis {
            val game: Game? by mutableLazy { readGameFromSave() }
            game
        }
        assert(time in 450..550)
    }

    @Test
    fun `The same object is returned every time`() {
        val game by mutableLazy { object {} }
        assert(game === game)
    }

    private class Game()

    private fun readGameFromSave(): Game? {
        Thread.sleep(500)
        return Game()
    }
}