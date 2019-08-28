fun joinStrings(vararg texts: String, separator: String = ", ") =
        texts.joinToString(separator)

fun changeSeparator() = joinStrings("A", "B", "C", separator = ".")

fun main() {
    print("Hello, World")
}