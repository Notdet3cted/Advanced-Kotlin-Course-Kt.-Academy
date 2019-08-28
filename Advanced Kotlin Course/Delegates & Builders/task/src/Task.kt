import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <T> mutableLazy(initializer: () -> T): ReadWriteProperty<Any?, T> = TODO()

fun main() {
    var elem by mutableLazy { "AAA" }
    print(elem) // AAA
    elem = "BBB"
    print(elem) // BBB
}