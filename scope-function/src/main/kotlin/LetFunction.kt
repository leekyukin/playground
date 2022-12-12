fun main() {
    /*
    <--LET-->
    @Returns: lambda result
    @Context object: this

    LET = WITH + Null Management
    */

/*
    @comment this piece of code will crash
*/
//    val person: Person = null
//    println(name.reversed())
//    println(name.capitalize())
//    println(name.length)

    /*
    so we can use it without crashing as below
    */
    val name: String? = "hello"
    val nameLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        println(it.length)
        it.length
    }

    println(nameLength)
}

