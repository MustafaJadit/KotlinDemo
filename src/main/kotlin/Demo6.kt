import kotlin.math.pow

class Emptiness {

}

class Emptiness2


fun sum2(a: Int, b: Int = a) = a + b


fun main() {
//    print("first print")
//    println("first println")
//    println("second println")

//    val num = 3.0.pow(2)
//    println(num)
//    val name = readln().toString()
//    println("your name is $name")

//    val b: Boolean = true
//    val i: Int = 23

//    println(sum2(1))   // 1 + 1
//    println(sum2(2, 3))// 2 + 3
//    println(Int.MAX_VALUE)
//    println(2f.pow(16))


    println(Rainbow.valueOf("Red"))
}

enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}


class Size(name: String) {
    val n = name
}


enum class MyEnum {
    NUdd, dfsf, Null;

    fun say() {}
}

data class Customer(val name: String, val email: String)
data class Customer2(var name: String, var email: String)

fun fun2() {
    (1..10).forEach { println(it) }
}