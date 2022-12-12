fun main() {
    val messyPerson = Person()
    messyPerson.name = "Jordan Peterson"
    messyPerson.age = 60
    println("🧶 -> name: ${messyPerson.name}, age: ${messyPerson.age}")

    /*
    <--RUN-->
    @Returns: lambda result
    @Context object: this

    RUN = WITH + Null Management
     */

    val neatPerson: Person? = null

    val message = neatPerson?.run {
        name = "Jordan Peterson😎"
        age = 60
        "message message message"
    }

    println(message)
}