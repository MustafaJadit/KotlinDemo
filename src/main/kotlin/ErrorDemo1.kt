import java.io.IOException
import java.util.regex.Pattern

fun main() {
//    var number: Int = readLine()!!.toInt()
//    println(++number)

//    val inputString = readln()
//    val lastIndexChar = inputString[inputString.length - 1]
//    println(lastIndexChar)

//    println(parseCardNumber("1234 2345 3245 2342"))

    
}

fun parseCardNumber(cardNumber: String): Long {
    val pattern: Pattern = Pattern.compile("\\d{4} \\d{4} \\d{4} \\d{4}")
    val matcher = pattern.matcher(cardNumber)
    var long_: Long
    var str = ""
    if (matcher.matches()) {
        val result = cardNumber.split(Pattern.compile(" "))
        for (s in result) {
            str += s
        }
        long_ = str.toLong()
        return long_
    } else throw ArithmeticException()

}


fun parseCardNumber2(cardNumber: String): Long {
    // TODO
    val arr = cardNumber.split(" ")
    var str = ""
    for (a in arr) {
        str += a
    }
    var long_ = 0L
    try {
        long_ = str.toLong()

    } catch (e: java.lang.NumberFormatException) {
        throw e
    }

    return long_
}

fun printFifthCharacter(input: String): String {
    val elseName = "The input word is too short!"
    val tryName = "The fifth character of the entered word is"
    return try {
        "$tryName ${input[4]}"
    } catch (e: StringIndexOutOfBoundsException) {
        elseName
    }
}

fun convertStringToDouble(input: String): Double {
    /**
     * It returns a double value or 0 if an exception occurred
     */
    return try {
        input.toDouble()
    } catch (e: RuntimeException) {
        0.0
    }
}

fun solution() {
    // write here
    try {
        val first = readln().toInt()
        val second = readln().toInt()
        println(first)
    } catch (e: RuntimeException) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }

}

