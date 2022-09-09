package box

import javax.swing.Box

//fun main() {
////    val msg1 = "Hi"
////    val msg2 = "Hi"
////    println(msg1 == msg2)
////    println(msg1 == "Hi")
//
//    val blueBox = Box1(2)          // box with 3 balls
//    val azureBox = blueBox
//    println(blueBox == azureBox) // true, it's a copy
//    blueBox.addBall()             // add a ball to the first box
//    println(blueBox == azureBox) // true, the second box also contains 4 balls
//
//}

internal class Box1(var num: Int) {
    fun addBall() {
        num++
    }
}


fun main() {
    var sum = 0                                                // 1
    var countOdd = 0                                           // 2
    var countEven = 0                                          // 3
    val intsList = listOf<Int>(25, 14, 32, 13, 11, 55, 32, 21) // 4

    for (i in intsList) { // 5
        if (i % 2 == 0) { // 6
            sum += i      // 7
            countEven--   // 8
        } else {          // 9
            countOdd++    // 10
        }
    }
    println(countOdd)     // 11
}