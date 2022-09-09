fun main() {
//    var ch=readln().first()
//    var ch2=readln().last()
//    println(ch)
//    println(ch2)
//    abc
//    abc
//    a
//    c

//    val ch = 'a'
//    val ch2 = ch + 1
//    println(ch2)
//
//    println('\u00f7')

    val one = '1'
    println(one.isDigit())
    println('k'.isLetter())
    println('4'.isLetterOrDigit())
    println(' '.isWhitespace())
    println('K'.uppercaseChar())
    println('c'.uppercaseChar())

    val num=readln().toInt()
    val char=readln().first()
    println(char.code==num)
}