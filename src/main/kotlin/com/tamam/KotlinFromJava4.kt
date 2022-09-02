@file:JvmName("tamam3")
@file:JvmMultifileClass

package com.tamam

import java.net.IDN
import java.time.LocalDateTime
import kotlin.reflect.KClass


object MyObj {
    @JvmStatic
    fun callStatic() {
    }

    fun callNonStatic() {}
}

class User2(val name: String, var age: Int = 3, isBoy: Boolean) {
    val name2 = name
    val isBoy2 = isBoy
    fun fun2() {
        println(name)
        println(name2)
        println(isBoy2)

    }

    val x: Int
        @JvmName("getMustafaX")
        get() = 23

    fun getX() = 10

    @get:JvmName("x")
    @set:JvmName("changeY")
    var y: Int = 53
//    set(value) {
//        value+2
//    }

}

// default method starts
interface Robot {
    //priot to Kotlin 1.4
//    @JvmDefault
    fun move() {
        println("walking")
    }

    fun speak(): Unit
}

// default method ends


