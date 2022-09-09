package com.tamam.kotlin_java_mutual_conversion

import Foo4

fun main() {
    demo13()


}

fun demo13() {

    var java = Int::class.java
    println(java)

    var javaObjectType = Int::class.javaObjectType
    println(javaObjectType)

    var javaClass = Int.javaClass
    println(javaClass)
    var java1 = Int.Companion::class.java
    println(java1)


}

fun demo12() {

    var foo4 = Foo4()
    var intArrayOf = intArrayOf(12, 4, 1_2332)
    foo4.removeIndiceVarArg(*intArrayOf)
}


fun render(list: List<*>, to: java.lang.Appendable) {
    try {

    } catch (e: java.lang.Exception) {

    }
    for (item in list) {
        to.append(item.toString())
    }
}

private fun demo11() {
    var foo4 = Foo4()
    println(foo4 is Foo4)
    var foo41 = foo4 as Foo4
    var intArray = IntArray(3)
    intArray[1] = 32
    intArray.forEach { println(it) }
    println("string array")
    var array = Array<String>(4) {
//        val v = it.plus(2);
        var v = it + 3
        v.toString()
    }
    array.forEach { println(it) }

    var intArrayOf = intArrayOf(2, 4, 1, 6)
}

fun toSet(elements: Set<String?>): Set<String?> {
    return mutableSetOf<String>()
}

