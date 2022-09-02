import java.util.*
import MyCallback as MyCallback

fun main(args: Array<String>) {
    m14()
}


private fun m1() {
    var a: Int
    a = 12
    println("mustafa " + a)
    val s: String
    s = "string1"
    println(s)
    var c: Boolean? = null
    println(c)
    var person = Person()
    person.age = 22
    println(person.age)

    println(key)

    println(Human.race)

    person.color = "yello"
    println(person.color)

    person.gender = true
    println(person.gender)
}

const val key2 = 2

const val key: Int = 1
//const val person = Person()// Only primitives and String are allowed


class Person {
    var name: String = "jason"
    var age: Int = 0
        get() {
            println("get age")
            return field
        }
        set(value) {
            println(
                "value is " + value
            )
            value
        }

    var color: String
        get() = name
        set(value) {}

    var gender: Boolean
        get() = true
        set(v) {}

}

class Human {
    companion object {
        const val race: String = "Caucasian"
    }
}

class Hare(name2: String = "Kuramoto", var furColor: String) {


    var eyeColor: String = ""
    fun speak() {
        println(furColor)
        eyeColor = "red"
        println(eyeColor)

    }

    override fun toString(): String {
        return eyeColor + "\t" + furColor + "\t"
    }

    constructor(number: Int) : this(name2 = "yamada", "brown") {
        println("secondary contructor " + number)

    }
}


private fun m2() {
    var a = if (true) 3 else false
    println(Hare(("myJvmName"), "yellow").toString())
    println(Hare(123))
}


private fun m3() {
    println(Hare(12).let {
        println("let eye color " + it.eyeColor)
//        it.furColor
    })

    println(Hare(12).run {
        println("run eye color " + eyeColor)
        eyeColor
    })

    println(Hare(12).also {
        println("also eye color " + it.eyeColor)
        it.furColor
    })

    println(Hare(12).apply {
        println("apply eye color " + eyeColor)
        furColor
    })





    with(Hare(12)) {
        println("with eye color " + eyeColor)
        eyeColor
    }
}


private fun m4() {
    println(
        """this is a free text format
        |       right 
        |  sure
        |closeLine
    """.trimMargin()
    )
}


private fun m5() {
    var bitwise1 = true and false
    val bitwise2 = true or false
    var bitwise3 = (true xor false).also { println("bitwise3 is " + it) }
    println(!true)

}


private fun m6() {
    data class Car(var year: Int)

    data class Plane(var year: Int)

    var car = Car(2011);
    if (car is Car) {
        println("car is Car")
        println("year is " + car.year)
    }

    var car2: Car? = Car(2014);
    println("year is " + car2?.year)

    var car3: Any = Car(2018)
    if (car3 is Car) {
        println(car3.year)
    }

    var car4: Any = Car(2022)
    println((car4 as Car).year)

    var car5: Any? = Car(2022)
    println((car5 as Car).year)


}


private fun m7() {

    for (score in 0..10 step 1) {
        println(score)
    }

}


private fun switchFunction(number: Int): Any {
    val result = when (number) {
        2 -> println("two")
        in 3..5 -> "normal"
        in 82..100 -> "big"
        6, 8 -> "nice"
//        "d" _ >"
//            format exception
//            "
        else -> "fail"

    }
    return result
}

private fun m8() {
    println(switchFunction(3))
    println(switchFunction(2))

}

private fun m9() {
    var items = setOf<String>("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too");
    }
}


private fun m10(): Int {
    var arrayOf = arrayOf(1, 2, 5)
    arrayOf.forEach { println(it) }

    println("    for (i in 1..10){\n")
    for (i in 1..10) {
        println(i)
    }
    println("    for (i in 1 until 10 ){\n")
    for (i in 1 until 10) {
        println(i)
    }

    println("    for (i in 10 downTo 3) {\n")
    for (i in 10 downTo 3 step 3) {
        println(i)
    }

    println("    for (item in arrayOf(5,2)){\n")
    for (item in arrayOf(5, 2)) {
        println(item)
    }


    println("    for (item in listOf(6, 1, 3)){\n")
    for (item in listOf(6, 1, 3)) {
        println(item)
    }


    println("     for (item in mapOf<String, Int>(\"a\" to 3, \"b\" to 6)) {\n ")
    for (item in mapOf<String, Int>("a" to 3, "b" to 6)) {
        println(item)
    }

// return "34"
    return 43
}


private fun m11() {

    fun varArgs(vararg num: Int) {
        println(if (num.size > 0) num.size else "it is empty")
    }

//    varArgs(3,1) //2
    varArgs() //it is empty

    fun quickFun(): Int = 2

    println(quickFun())

    fun quickFun2() = 5
    println(quickFun2())
}


private fun m12() {
    println(Utils.getName(23))
    println(Utils.getName(2))
    println(Utils.getInstance("dummy").type)

}


class Utils private constructor(var type: String) {
    companion object {
        fun getName(value: Int): String {
            return when (value) {
                23 -> "twenty three"
                else -> "other number"
            }
        }

        fun getInstance(category: String): Utils {
            return Utils(category)
        }
    }

}


data class Formula(var name: String, var age: Int) {
    lateinit var late1: String

    public fun myPrinter() {
        println(name)

    }

    init {
        println(age)
    }

}

private fun m13() {
    var formula = Formula("green", 3)
    formula.myPrinter()
    var copy = formula.copy(age = 4)
    println(copy)


}


private fun m14() {
    fun Int.triple() = this * 3
    fun Int.logic1(name: String) = name.length
    println(23.triple())
    println(23.logic1("tafa"))

}

class Sheep {
    private lateinit var sort: String

    init {
        sort = "after init block"
    }

    constructor(mySort: String) : this() {

    }

    constructor() {
        sort = "after constructor method"
    }

    fun getSort() = sort


}


private fun m15() {
    var sort = Sheep("kashgar")
    println(sort.getSort())
}


private fun m16() {

    println(Ox())
    println(Ox(4))

}

class Ox(age: Int) {
    init {
        println(age)
    }

    constructor() : this(2) {

    }

}

enum class Direction(direction: Int) {
    North(1), South(2);

    var direction: Int = -1

    init {
        this.direction = direction
    }

    @JvmName("getDirection1")
    fun getDirection() = direction
}


private fun m18() {
    var listOf = listOf<Profile>(Profile(2, "Veten"), Profile(3, "Omar"), Profile(1, "Zumrat"))
    listOf = listOf.sortedWith { t, t2 ->
        val i = t.age - t2.age
        if (i == 0) t.name.compareTo(t2.name)
        else i
    }
    listOf.forEach { println(it) }

}

private fun m17() {
    var listOf = listOf<Profile>(Profile(2, "Veten"), Profile(3, "Omar"))
    listOf.forEach { println(it) }
//    Profile(age=2, name=Veten)
//    Profile(age=3, name=Omar)
//    var sortedWith = listOf.sortedWith(Comparator.naturalOrder())
//    sortedWith.forEach { println(it) }
//    Profile(age=3, name=Omar)
//    Profile(age=2, name=Veten)

}


data class Profile(var age: Int, var name: String) : Comparable<Profile> {
    override fun compareTo(other: Profile): Int {
//        return age - other.age
        return name.compareTo(other.name)
    }

}


private fun m19() {
    var myCallback = object : MyCallback {
        override var name: String
            //            get() = "osman"
            get() {
                println("get method in the myCallback")
                return "osman"
            }
            set(value) {
                println("set method " + value)
            }

        override fun getNumber(): Int {
            println("The size of the name is ")
            return name.length
        }

    }

    println(myCallback.getNumber())

}

interface MyCallback {
    var name: String
    fun getNumber(): Int
}


private fun m20() {

    println(Turtle.sheep == Turtle.sheep)

}

object Turtle {
    lateinit var sheep: Sheep

    init {
        sheep = Sheep()
    }
}


private fun m21() {

    var charArrayOf = charArrayOf('k', 'o', 'z', 'a')
    println(charArrayOf)
}


private fun m22() {
    var intValue = 1
    println(intValue.javaClass)
    println(intValue.toLong().javaClass)
}


private fun m23() {
    var listOf = listOf<Int?>(23, null, 52)
    listOf.forEach { println(it) }

    println("listOf.filterNotNull().forEach { it }")
    var filterNotNull = listOf.filterNotNull()
    filterNotNull.forEach { println(it) }
    filterNotNull.forEach(::println)

}

private fun m24() {

    Movie("yasin")
}

class Movie(name: String) {
    init {
        println("this is a moview initialization block ${name}")
    }
}


private fun m25() {

    for ((k, v) in mapOf<String, Int>("a" to 3, "b" to 6)) {
        println("key is ${k} value is ${v}")

    }
}

private fun m26() {

    var arrayOf = arrayOf(3, 6, 1, 43)
    for (i in arrayOf.indices) {
        println(arrayOf[i])
    }
}
