@file:JvmName("tamam3")
@file:JvmMultifileClass

package com.tamam.kotlin_java_mutual_conversion

import java.net.IDN
import java.time.LocalDateTime


fun getTime2() {
    var now = LocalDateTime.now()
    println(now)
}

class User(id: String) {
    //    java field
//    @JvmField
    var ID = id;
}