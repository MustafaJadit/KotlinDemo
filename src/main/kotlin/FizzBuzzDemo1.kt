fun main() {
    // put your code here
    val begin = readln().toInt()
    val end = readln().toInt()
    for (i in begin..end) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("fizzBuzz")
        } else if (i % 3 == 0) {
            println("fizz")
        } else if (i % 5 == 0) {
            println("buzz")
        } else {
            println(i)
        }
    }
}
