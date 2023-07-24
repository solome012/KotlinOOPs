package BasicKotlin

class Person {
    private var name: String = ""

    // Getter
    fun getName(): String {
        return name
    }

    // Setter
    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val person = Person()
    person.setName("John") // Setter usage
    val name = person.getName() // Getter usage
    println(name) // Output: John
}
