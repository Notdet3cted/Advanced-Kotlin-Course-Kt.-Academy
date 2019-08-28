interface Person {
    val name: String
    val age: Int

    // Always true when age >= 21
    val canBuyAlcohol: Boolean

    fun helloText(): String

    fun cheerText(person: Person): String
}

// TODO: Implement here class Businessman that implements Person
// TODO: Implement here class Student that implements Person