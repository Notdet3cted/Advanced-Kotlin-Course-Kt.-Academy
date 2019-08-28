// To prevent unintentional stdlib functions usage
import kotlin.collections.flatMap as stdlibFlatMap
import kotlin.collections.forEach as stdlibForEach
import kotlin.collections.map as stdlibMap
import kotlin.collections.filter as stdlibFilter

inline fun <T> Iterable<T>.onEach(operation: (T) -> Unit): Iterable<T> {
    for (elem in this) {
        operation(elem)
    }
    return this
}

inline fun <T, R> Iterable<T>.map(transformation: (T) -> R): List<R> {
    val list = arrayListOf<R>()
    for (elem in this) {
        list.add(transformation(elem))
    }
    return list
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val list = arrayListOf<T>()
    for (elem in this) {
        if (predicate(elem)) {
            list.add(elem)
        }
    }
    return list
}

// Implement flatMap

fun main() {
    println((1..10).filter { it % 2 == 0 })
    println((1..10).map { it * it })

    (1..10).onEach { print(it) }
    println()

    println((1..5).flatMap { listOf(it, it + 10, it + 100) }) // [1, 11, 101, 2, 12, 102, 3, 13, 103, 4, 14, 104, 5, 15, 105]

    data class Worker(val name: String)
    data class Department(val workers: List<Worker>)
    val departments = listOf(
            Department(listOf(Worker("Jack Black"), Worker("James Roe"))),
            Department(listOf(Worker("Mick Kick"), Worker("Johns Rones")))
    )

    val allWorkers = departments.flatMap { it.workers }
}