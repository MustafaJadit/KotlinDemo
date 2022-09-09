package com.tamam.kotlin_java_mutual_conversion

import java.sql.Time
import java.time.LocalDateTime

fun main() {
    getTime()
}
fun getTime() {
    var now = LocalDateTime.now()
    println(now)
}

