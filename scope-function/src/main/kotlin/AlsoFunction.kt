fun main() {
    val messyPerson = Person()
    messyPerson.name = "Jordan Peterson"
    messyPerson.age = 60
    println("🧶 -> name: ${messyPerson.name}, age: ${messyPerson.age}")

    /*
    <--ALSO-->
    @Returns: context object
    @Context object: it
     */

    val neatPerson = Person().also {
        it.name = "Jordan Peterson😎"
        it.age = 60
        println("♻️ -> name: ${it.name}, age: ${it.age}")
        println(it)
    }
    println(neatPerson)
}