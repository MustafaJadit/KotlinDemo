fun main() {
//    letDemo()
//    alsoDemo()
//    applyDemo()
//    withDemo()
    runDemo()
}

fun runDemo() {
    println(Person7("Mathew").run {
        name = "jason"
        343
    })
}

fun withDemo() {
    println(with(Person7("Mathew")) {
        name = "jason"
        232
    })
}

fun applyDemo() {
    println(
        Person7("Mathew").apply {
            name = "jason"
            22
        }
    )
}

fun alsoDemo() {
    println(
        Person7("Mathew").also {
            it.name = "jason"
            32
        }
    )
}

fun letDemo() {
    println(Person7("Mathew").let {
        it.name = "jason"
        23
    })
}

data class Person7(var name: String)