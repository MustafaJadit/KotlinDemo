package com.tamam

import java.sql.Time
import java.time.LocalDateTime

fun main() {
    getTime()
}
fun getTime() {
    var now = LocalDateTime.now()
    println(now)
}

