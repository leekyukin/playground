fun main() {
    val messyPerson = Person()
    messyPerson.name = "Jordan Peterson"
    messyPerson.age = 60
    println("🧶 -> name: ${messyPerson.name}, age: ${messyPerson.age}")

    /*
    <--APPLY-->
    @Returns: context object
    @Context object: this
     */

    val neatPerson = Person().apply {
        name = "Jordan Peterson😎"
        age = 60
        println("♻️ -> name: ${name}, age: ${age}")
    }
}