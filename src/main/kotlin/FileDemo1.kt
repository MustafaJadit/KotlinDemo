import java.io.FileInputStream
import java.io.FileReader
import java.io.FileWriter

fun main() {

//    fileReaderDemo1()

//    printUyghurChar()

//    fileReaderDemo2()
//    fileReaderDemo3()
//    fileReaderDemo4()
//    fileReaderDemo5()
//    fileReaderDemo6()
//    fileWriteDemo1()
    fileWriteDemo2()
}

fun fileWriteDemo2() {
    val inputStream = FileInputStream("somefile3.log")
    var i = inputStream.read()
    while (i >= 0) {
        
    }
}

fun fileWriteDemo1() {
    val write = FileWriter("somefile2.log")
    val cArray = charArrayOf('a', 'n', ' ', 'a', 'p', 'p', 'l', 'e')

    write.write(cArray)
    write.write('.'.code)

    write.appendLine()
    write.write(cArray, 4, 3)
    write.write("last line")
    write.close()

}

fun fileReaderDemo6() {
    var reader = FileReader("somefile.txt")
    reader.forEachLine { println(it) }
}


fun fileReaderDemo5() {

    var reader = FileReader("somefile.txt")
    val charArray = CharArray(4)
//    var partialTextLength = reader.read(charBuffer, 0, 2000)
// .IndexOutOfBoundsException. since length is a spoon, charBuff is a soup.
    var partialTextLength = reader.read(charArray, 0, 2)
    val stringBuilder = java.lang.StringBuilder()
    while (partialTextLength >= 0) {
        stringBuilder.append(String(charArray, 0, partialTextLength))
        partialTextLength = reader.read(charArray)
    }
    reader.close()
    println(stringBuilder)
}

fun fileReaderDemo4() {
    var reader = FileReader("somefile.txt")
    reader.readLines().forEach { println(it) }
    reader.close()


}

fun fileReaderDemo3() {
    var reader = FileReader("somefile.txt")
    println(reader.encoding)
    reader.close()

}

fun fileReaderDemo2() {
    var reader = FileReader("somefile.txt")
    println("reader.ready() ${reader.ready()}")
    println(reader.readText())
    println("reader.ready() ${reader.ready()}")
    reader.close()

}

private fun fileReaderDemo1() {
    var reader = FileReader("somefile.txt")
    var i: Int = reader.read()
    print("id $i, character ${i.toChar()}\n")

    while (i >= 0) {
        val old = i
        i = reader.read()
        print("id $old, character ${i.toChar()}\n")
    }


    println("another readText() " + reader.readText())

    println("10.toChar() " + 10.toChar())
    println(" ب     " + 'ب'.code)
    reader.close()

}


fun printUyghurChar() {
    for (i in 1549..1749) {
        println(i.toChar())
    }

}
