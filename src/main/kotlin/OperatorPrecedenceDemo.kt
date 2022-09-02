class OperatorPrecedenceDemo {}

fun main() {
    var i = 1
//    var j = i++
//    println("i = $i, j = $j") //i = 2, j = 1

//    var j = (i++ + 1)
//    println("i = $i, j = $j")//i = 2, j = 2

//    var j = (i++ + 1 + i)
//    println("i = $i, j = $j") //i = 2, j = 4

    var n = 0b100 shr 1;
    println(n)  //2

    var n3 = 0b100 shl 1;
    println(n3)  //8

    val n2 = 0b10 and 0b1
    println(n2) //0

    println(0b11 or 0b10)   //3


    println(0b11 xor 0b00)  //3
    println(0b10 xor 0b10)  //0
    println(0b10.inv()) //-3

}