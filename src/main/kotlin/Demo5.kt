import java.util.*
import kotlin.math.sqrt

fun main() {
    m31Demo5()
}

fun m31Demo5() {

    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next()
        println(next)
    }
}

fun m30Demo5() {
    var array = Array(10) {
        it
    }
    println("before sorting")
    array.forEach { println(it) }

    //sort by descent
    repeat(10) { outer ->
        repeat(10 - outer - 1) { inner ->
            if (array[inner] < array[inner + 1]) {
                val temp = array[inner]
                array[inner] = array[inner + 1]
                array[inner + 1] = temp
            }
        }
    }
    println("after sorting")
    array.forEach { println(it) }
}

fun m29Demo5() {
    var array = Array(10) {
        it
    }
    repeat(10) {
        array[it] = it * 2
    }

    array.forEach { println(it) }
    println("array.toString() " + array.toString())

}

fun m28Demo5() {
    repeat(2) { index ->
        println("index is $index")
    }
}

fun m27Demo5() {
    val a = 2
    while (a > 1) {
        println("a is $a")
    }
}

fun m26Demo5() {

    val number = 1357.05
    val number_log = Math.log10(number)
    println(number_log)
    val number_round = Math.round(number_log).toDouble()
    println(number_round)
}

fun m25Demo5() {

    println(3.toString() + "f")
}

fun m24Demo5() {
    val v = "d"
    when (v) {
        "dd" -> println("dd")
    }
}

fun m23Demo5(s: String) {

    val (a, b, c) = readln().split(" ")
    val a_ = a.toInt()
    val c_ = c.toInt()
    println(a_ + c_)

}

fun m22Demo5(s: String) {
    println((s in "a".."z" && s in "1".."8"))// compare the first char of s
}


fun m20Demo5(c: Int) {
    val result: Boolean = c in 2..5 step 2
    print(result)

    val noWithin = c !in 2..5
    println(noWithin)
    // println = *&\n

}

fun m21Demo5() = println("hello m21")


fun m20Demo5(): Unit {
    return;
    println("")// unreachable code
}

fun m16Demo5(): Int {
    return 3
}

fun m17Demo5() = 3

fun m18Demo5(): Int = 32

fun m19Demo5() {
    val sum = sum19Demo5(32, 1)
    println(sum)
}

fun sum19Demo5(a: Int, b: Int) = a + b

fun m15Demo5() {

    val a = readln().toInt()
    val b = readln().toInt()

    println(
        if (a == b) {
            "a equal b"
        } else if (a > b) {
            "a is greater than b"
        } else {
            "a is less than b"
        }
    )
}

fun m14Demo5() {

    val a = 2
    val b = 3
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max)
}

fun m13Demo5() {
    println('c' + 1)
    println("true".toBooleanStrict())// strict is case sensitive
    println("T".toBoolean())// case insensitive
}

fun m12Demo5() {
//    An expression must start with a String.
//    val errorString = 10 + "abc" // an error here!
    println("mustafa".repeat(3))

    println(
        """This is a raw string
        |   second line     . New sentence.
        | new line again.
    """.trimMargin()
    )

}

fun m11Demo5() {
    val add = 100 % 7
    println(2 + add)
}

fun m10Demo5() {
    val uByte: UByte = 5u
    val uShort: UShort = 523u
    val uByte2 = 3423u
}

fun m9Demo5() {
    var a = 3
    a += 2 // 5
    a -= 2 // 3
    a *= 2 // 6
    a /= 2 // 3
    a %= 2 // 1
}

fun m8Demo5() {
    val b1: Byte = 5         // Line 1
    val b2: Byte = 2 + 3     // Line 2
    val s1: Short = (2 + b1).toShort()   // Line 3
    val s2: Short = (10 + 3L).toShort()  // Line 4
}

fun m7Demo5() {

    val b0: Byte = 2
    val s0: Short = 10
    val n0: Int = 5
    val l0: Long = 14
    val f0: Float = 11.4f

    val b: Byte = 5                 //1
    val s: Short = (2 + b0).toShort()       //2
    val n: Int = s0.toByte() + 2    //3
    val l: Long = (n0 + 4).toLong()            //4
    val f: Float = l0.toFloat() + 1 //5
    val d: Double = (f0 / 1).toDouble()        //6
}

fun m6Demo5() {
    println(11 / -4)   // prints -2
    println(11 % -4)   // prints 3
    println(-11 / 4)   // prints -2
    println(-11 % 4)   // prints -3
    // division - normal division with sign
    println(-11 / -4)  // prints 2
    // modules  -4 * 2 + -3
    println(-11 % -4)  // prints -3

    println(5 % 10)

    val one: Byte = 1
    val five: Byte = 5
    val six = (one + five).toByte() // 6, Byte
}

fun m5Demo5() {

    val floatNumber = 10f
    val doubleNumber = 1.0

//    val shortNumber = floatNumber.toShort() // avoid this
//    val byteNumber = doubleNumber.toByte()  // avoid this

    val shortNumber2 = floatNumber.toInt().toShort() // correct way
    val byteNumber3 = doubleNumber.toInt().toByte()  // correct way

    val n0 = "8".toInt() // Int
    val d = "10.09".toDouble() // Double
    val b = "true".toBoolean() // Boolean

    val b1 = "false".toBoolean() // false
    val b2 = "tru".toBoolean()   // false
    val b3 = "true".toBoolean()  // true
    val b4 = "TRUE".toBoolean()  // true


    val something = readln()

    val d2 = something.toDouble()
    val f = d.toFloat()
    val i = f.toInt()
    val b5 = i.toByte()

    val (a5, b6) = readln().split(" ")
    println(a5)
    println(b6)

    val n: Int = readLine()!!.toInt()

}

fun m4Demo5() {

    val num: Int = 23
    val doub = num.toDouble()
    println(sqrt(doub))

    val num2: Int = 100
    val l2 = num2.toLong()

    val n1: Int = 125
    println(n1.toChar())

    val d: Double = 12.5
    val l3: Long = d.toLong()

    val d2: Double = 10.2
    val n2: Long = 15
    val i3 = d2.toInt()
    val i4 = n2.toInt()

}

private fun m3() {
    val s = Scanner(System.`in`)
    var nextLine = s.nextLine()
    println(nextLine)
    var readLine = readLine()
    println(readLine)

}

private fun m2() {
    val applesCount: Int
    applesCount = 2
    println(applesCount)

    val b1: Boolean = false

    var v1 = readLine()
    println(v1)
    var v2 = readln()
    println(v2)
    var v3 = readln().toInt()
    println(v3)
    var (a, b) = readln().split(' ')
    println("a $a b $b")
}

private fun m1() {
    var dayOfWeek = "Monday"
    val dayOfWeek2: String = "Monday"
    var dayOfWeek3 = dayOfWeek
    dayOfWeek3 = "Tuesday"
    println(dayOfWeek)
    println(dayOfWeek == "Monday")
    println(dayOfWeek.equals("Monday"))
    println(dayOfWeek == dayOfWeek2)
}