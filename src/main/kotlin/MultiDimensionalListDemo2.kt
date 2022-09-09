fun main() {
//    val mutList2D = mutableListOf(
//        mutableListOf<Int>(0),
//        mutableListOf<Int>(1, 2),
//        mutableListOf<Int>(3, 4, 5)
//    )
//    println(mutList2D)
//
//    val mutListOfChar2D = mutableListOf(
//        mutableListOf<Char>('A', 'R', 'R'),
//        mutableListOf<Char>('A', 'Y', 'S')
//    )
//    println(mutListOfChar2D)
//
//    val mutListOfStringANdInt2D = mutableListOf(
//        mutableListOf("practice", "makes", "perfect"),
//        mutableListOf(2, 5)
//    )
//    println(mutListOfStringANdInt2D) //[[practice, makes, perfect], [2, 5]]

//    // Do not touch code below
//    val inputList: MutableList<MutableList<String>> = mutableListOf()
//    val n = readLine()!!.toInt()
//    for (i in 0 until n) {
//        val strings = readLine()!!.split(' ').toMutableList()
//        inputList.add(strings)
//    }
//    // write your code here
//    val mutableList: MutableList<MutableList<String>> = mutableListOf()
//    mutableList.apply {
//        add(mutableListOf<String>().apply {
//            add(inputList[0][0])
//            add(inputList[0][inputList[0].lastIndex])
//        })
//
//        add(mutableListOf<String>().apply {
//            add(inputList[inputList.size - 1][0])
//            add(inputList[inputList.size - 1][inputList[inputList.size - 1].lastIndex])
//        })
//    }
//    println(mutableList[0].joinToString(" "))
//    println(mutableList[1].joinToString(" "))

    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    // Do not change lines above
    // Write your code here
    println(inputList[2].joinToString(", "))

}