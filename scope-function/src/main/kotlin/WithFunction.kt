fun main() {
    val messyPerson = Person()
    messyPerson.name = "Jordan Peterson"
    messyPerson.age = 60
    println("🧶 -> name: ${messyPerson.name}, age: ${messyPerson.age}")

    /*
    <--WITH-->
    @Returns: lambda result
    @Context object: this
    */

    val ageAfterTenYears = with(Person()) {
        name = "Jordan Peterson😎"
        age = 60
        println("♻️ -> name: ${name}, age: ${age}")
        age!! + 10
    }

    println("age after ten years: $ageAfterTenYears")
}