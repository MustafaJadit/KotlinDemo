fun main() {
    joinToString()
}

fun joinToString() {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers)
    println(numbers.joinToString())
}

fun flat2() {

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten())
    println(numberSets)

}

fun associate2() {

    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.length })
//    {one=3, two=3, three=5, four=4}
//    {3=two, 5=three, 4=four}
}

fun zip2() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    var zip = colors.zip(animals) { color, animal ->
        "the animal $animal and color $color "
    }
    println(zip)
    println("= \"one\" to 2")
    var pair = "one" to 2
    println(pair)
    println(pair.javaClass)


    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())
}

fun zip1() {

    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))


}

fun map2() {

    val numbers = setOf(1, 2, 3)
    println(numbers.mapNotNull { if (it == 2) null else it * 3 })
    println(numbers.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })
}

private fun map1() {
    val numbers = setOf(1, 2, 4)
    println(numbers.map { it * 4 })
    println(numbers.mapIndexed { index, i -> i * index })
}