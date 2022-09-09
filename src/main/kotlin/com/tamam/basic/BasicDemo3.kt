package com.tamam.basic

fun main() {
    plusMinusMap()
}

fun plusMinusMap() {
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    var plus = numbersMap.plus(Pair("four", 4))
    println(numbersMap)
    println(plus)

    var mutableMapOf = mutableMapOf("one" to 1)
    mutableMapOf.plus(Pair("second", "four"))
    println(mutableMapOf)
    mutableMapOf.put("seven", 31)
    println(mutableMapOf)
    println("mutableMap[\"one\"] is ${mutableMapOf["one"]}")
}

fun filterInMap() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 }
    println(filteredMap)
}

fun retrieveKV() {
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(numbersMap.get("one"))
    println(numbersMap["one"])
    println(numbersMap.getOrDefault("one", 10))

}

fun remove_() {
    val numbers = mutableListOf(1, 2, 3, 4, 3)
    numbers.removeAt(1)
    println(numbers)
}

fun update() {
    val numbers = mutableListOf("one", "five", "three")
    numbers[1] = "five"
    println(numbers)
    numbers.set(1, "six");
    println(numbers)
    var arrayOf = arrayOf("one", "two")
    arrayOf[1] = "three"
    println(arrayOf)
}

fun linearSearch() {
    val numbers = listOf(1, 2, 3, 4, 2, 5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
}

fun subList_() {
    println((0..12).toList().subList(3, 6))
}

fun listIndex() {

    val numbers = listOf(1, 2, 3, 4)
    println(numbers.get(0))
    println(numbers[0])
    var orNull = numbers.getOrNull(5)
    println(numbers.getOrElse(4, { it * 2 }))
}

fun removeElements() {
    val numbers = mutableListOf(1, 2, 3, 4)
    println(numbers)
    var filter = numbers.filter { it >= 3 }
    println(numbers)
    println(filter)
    println()

    var retainAll = numbers.retainAll { it >= 2 }
    println(numbers)
    println(retainAll)
}

fun collectionRemove() {
    val numbers = mutableListOf("one", "two")
    numbers -= "one"
    println(numbers)
    numbers.remove("two")
    println(numbers)

    numbers.addAll(listOf("six", "seven"))
    println(numbers)

    numbers.removeAll(listOf("six", "seven"))
    println(numbers)

}

fun collectionWrite() {

    val numbers = mutableListOf("one", "two")
    numbers += "three"
    println(numbers)
    numbers += listOf("four", "five")
    println(numbers)
}

fun aggregateOperations3() {

    val numbers = listOf(5, 42, 10, 4)
    println(numbers.sum())
    println(numbers.sumBy { it * 2 })
}

fun aggregateOperations2() {
    val numbers = listOf(53, 62, 12, 13)
    println(numbers.minByOrNull { it % 3 })

    val strings = listOf("one", "two", "three", "four")
    println(strings.maxWithOrNull { a, b: String ->
        a.length - b.length
    })


}

fun aggregateOperations() {

    val numbers = listOf(53, 62, 12)
    println(numbers.count())
    println(numbers.maxOrNull())
    println(numbers.average())
    println(numbers.sum())

}

fun random_2() {

    val numbers = listOf("one", "two", "three", "four")
    println(numbers.shuffled())
}

fun reserved() {

    val numbers = listOf("one", "two", "three", "four")
    println(numbers.reversed())

}

fun ordering2() {

    val lengthComparator = Comparator { t: String, t2: String ->
        println("t1 is $t t2 is $t2")
        t.length - t2.length
    }
    println(listOf<String>("aa", "bb", "c").sortedWith(lengthComparator))
}

fun ordering() {

    println(Version(1, 3) > Version(1, 2))
    println(Version(2, 0) > Version(1, 5))
}


class Version(val major: Int, val minor: Int) : Comparable<Version> {
    override fun compareTo(other: Version): Int {
        if (major != other.major) {
            return major.compareTo(other.major)
        } else if (minor != other.minor) {
            return minor.compareTo(other.minor)
        } else return 0
    }

}

fun window_2() {

    val numbers = (1..10)
    println(numbers.windowed(3, 2, true))
    println(numbers.windowed(3, 2, false))
//    [[1, 2, 3], [3, 4, 5], [5, 6, 7], [7, 8, 9], [9, 10]]
//    [[1, 2, 3], [3, 4, 5], [5, 6, 7], [7, 8, 9]]
}

fun window_() {

    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.windowed(1))

}

fun chunk_() {
    val numbers = (1..8)
    println(numbers.chunked(3))
    var chunked = numbers.chunked(3) { it.sum() }
    println(chunked)

}

fun takeDrop() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(3))
    println(numbers.dropLast(3))
}

fun slice_() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..5 step 2))
    println(numbers.slice(setOf(3, 5, 0)))
}

fun contains_() {

    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.contains("two"))
    println("three" in numbers)
    numbers.containsAll(listOf("two", "three"))
}

fun random_() {

    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.random())
}

fun firstLastConditions() {

    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.first { it.length > 3 })
    println(numbers.last { it.length > 3 })
}

fun elementAtOrNull() {
    val numbers = linkedSetOf("One", "Two", "Three", "Four")
    println(numbers.elementAtOrNull(8))
    var elementAtOrElse = numbers.elementAtOrElse(8) { "d" }
    println(elementAtOrElse)
}

fun elementAt() {
    val numbers = linkedSetOf("One", "Two", "Three", "Four")
    println(numbers.elementAt(3))

    val numberSorted = sortedSetOf("One", "Two", "Three", "Four")
    println(numberSorted.elementAt(3))
}

fun grouping() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.length })
    println(numbers.groupBy { it.uppercase().elementAt(0) })
}

fun plus_() {

    val numbers = listOf("one", "two", "three", "four")
    var plusList = numbers + "five"
    println(plusList)
    println(plusList - listOf("one", "two"))
}

fun predicate_() {

    val numbers = listOf("one", "two", "three", "four")
    println(numbers.any { m -> m.contains("t") })
    println(numbers.none { m -> m.contains("t") })
    println(numbers.all { m -> m.contains("t") })
    var emptyList = emptyList<Int>()
    var predicate: (Int) -> Boolean = {
        println(it)
        it > 3
    }
    println(emptyList.all(predicate))
    var mutableList = mutableListOf<Int>().apply {
        add(4)
        add(5)
    }
    println(mutableList.all(predicate))
}

fun partioning() {

    val numbers = listOf("one", "two", "three", "four")
    var predicate: (String) -> Boolean = { it.length >= 4 }
    var partition = numbers.partition(predicate)
    println(partition)
}

fun stringRepresentation() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers)
    println(numbers.joinToString(" tirnak "))
    println(numbers.joinToString(" tirnak ").javaClass)
    println(numbers.joinToString { it + "haha" })
}

fun flatten() {

    val numberSets = listOf(setOf(1, 3, 5, 6), setOf(6, 7, 8))
    println(numberSets)
    println(numberSets.flatten())
}

fun associateBy() {

    val numbers = listOf("one", "two", "three", "four")
    var associateBy = numbers.associateBy { myKey -> myKey.length }
    var associateWith = numbers.associateWith { myKey -> myKey.length }
    println(associateBy)
    println(associateWith)
}

fun zip() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)
    println(colors.zip(animals).javaClass)


}

fun mapNotNull() {
    val numbers = setOf(1, 2, 3)
    println(numbers.mapNotNull { mufasa -> if (mufasa == 2) null else mufasa * 3 })
    println(numbers.mapIndexedNotNull { index, i -> if (index == 0) null else i * index })

}

fun mapIndex() {
    val numbers = setOf(1, 2, 3)
    println(numbers.javaClass)
    println(numbers.map { it + 3 }.javaClass)
    val transform: (Int) -> Int = { it * 3 }
    println(numbers.map(transform))
    println(numbers.mapIndexed { index, i -> index * i })
}

fun sorts() {

    val numbers = mutableListOf("one", "two", "three", "four")
// sort based on alphabetical order
    val sortedNumbers = numbers.sorted()
    println(numbers == sortedNumbers)  // false
// sort on specific comparable object
    numbers.sort()
    println(numbers == sortedNumbers)  // true
}

fun filters() {
    val numbers = listOf("one", "two", "three", "four")
    numbers.filter { it.length > 3 }  // nothing happens with `numbers`, result is lost
    println("numbers are still $numbers")
    val longerThan3 = numbers.filter { it.length > 3 } // result is stored in `longerThan3`
    println("numbers longer than 3 chars are $longerThan3")
}

fun ranges() {

    for (i in 4 downTo 1) {
        println(i)
    }
    println((1..10).filter { it % 2 == 0 }.get(1))
}

private fun listIterator() {
    val numbers = listOf("one", "two", "three")
    val listIterator = numbers.listIterator()
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
    println(listIterator)

    println("start iterating backward")
    while (listIterator.hasPrevious())
        println(listIterator.previous())
    println(listIterator)
}

private fun mutableListIterator() {
    val mutableListOf = mutableListOf("one", "two", "three")
    val mutableIterator = mutableListOf.iterator()
//    mutableIterator.hasNext()
    val next = mutableIterator.next()
    println("next $next")
    mutableIterator.remove()
    println("after removem $mutableListOf")
}

private fun copyList() {
    val sourceList = mutableListOf(1, 2, 3)
    val copyList = sourceList.toMutableList()
    val readOnlyCopyList = sourceList.toList()
    sourceList.add(4)
    println("Copy size: ${copyList.size}")

//readOnlyCopyList.add(4)             // compilation error
    println("Read-only copy size: ${readOnlyCopyList.size}")
}