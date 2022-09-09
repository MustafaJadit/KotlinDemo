fun main() {
    loop2()
}

class LoopDemo2 {
    lateinit var i1: String
    fun foo() {
        var i1 = "three"

        this@LoopDemo2.i1 = i1
    }
}

fun loop2() {

    outer@ for (i in 1..10) {
        for (j in 'a'..'z') {
            if (j == 'v') {
                continue@outer
            }
            println(i.toString() + "\t" + j + "\t")
        }
    }
    

}



private fun loop1() {

//    println((1..10).toList())
//    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    (1..10).forEach(::println)
//    1
//    2
//    3
//    4
//    5
//    6
//    7
//    8
//    9
//    10

}