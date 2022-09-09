package com.tamam.kotlin_java_mutual_conversion

import java.io.FileNotFoundException
import java.io.IOException


class Circle @JvmOverloads constructor(centerX: Int, centerY: Int, radius: Int = 32) {
    @JvmOverloads
    fun draw(label: String, lineWidth: Int = 2, color: String = "red") {

    }


}

@Throws(IOException::class)
fun writeToFile(){
    throw IOException()
}
