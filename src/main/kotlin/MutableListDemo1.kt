fun main() {
//    val list1 = listOf<String>("", "d")
//    println(list1)
//
//    val ml1 = mutableListOf<String>()
//    ml1.add("one")
//    ml1.add("two")
//
//    println(ml1)
//
//    val ml2 = MutableList(4) {}
//    println(ml2)
////    [kotlin.Unit, kotlin.Unit, kotlin.Unit, kotlin.Unit]
//
//    val ml3 = MutableList(2) { it.toString() }
//    println(ml3) //[0, 1]
//
//    val ml4 = MutableList(3) { "one" }
//    println(ml4) //[one, one, one]
//
//    val ml5 = mutableListOf<String>("carrot", "cucumber")
//    println(ml5) //[carrot, cucumber]
//


//    val nums = readln().split(" ").map { it.toInt() }.toMutableList()
////    println(nums)
//
//    val zero = nums.get(0)
//    val zero_ = nums[0]
//    println(zero)
//    println(zero_)

//    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
//    val stars = mutableListOf("Ginan", "Mu Crucis")
//    val names = mutableListOf("Jack", "John", "Katie")
//    val food = mutableListOf("Bread", "Cheese", "Meat")
//    val fruits = mutableListOf("Apple", "Banana", "Grape", "Mango")
//
//    southernCross.removeAt(0)
//    southernCross.remove("Mimosa")
//    println(southernCross)

//    val vowels = mutableListOf('a', 'o', 'i', 'e', 'u')
//    vowels+='y'
//    println(vowels)

//    val vowels = mutableListOf('a', 'o', 'i', 'e', 'u')
//    val vowels2 = vowels.toMutableList()
//    vowels2.add('k')
//    println(vowels)
//    println(vowels2)


//    val numbers = mutableListOf(1, 2, 3, 4, 5)
//
//    if (5 in numbers) {
//        println(numbers.indexOf(5)) // 4
//    }
//    println(numbers.minOrNull())
//    println(numbers.maxOrNull())
//    println(numbers.sum())

//    val firstList = readLine()!!.split(' ').toMutableList()
//    val secondList = readLine()!!.split(' ').toMutableList()
//    // do not touch the lines above
//    // write your code here
//    println(firstList.joinToString(", ") + ", " + secondList.joinToString(", "))

//    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
//    // do not touch the lines above
//    // write your code here
//
//    var sum = 0
//    numbers.forEach { sum += it }
//    numbers.add(0, sum)
//    numbers.removeAt(numbers.lastIndex - 1)
//    // do not touch the lines below
//    println(numbers.joinToString(" "))

//    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
//    for (index in daysOfWeek.indices) {
//        println("$index: ${daysOfWeek[index]}")
//    }

//    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
//    for (index in 1 until daysOfWeek.lastIndex) {
//        println("$index: ${daysOfWeek[index]}")
//    }

//    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
//    for (index in daysOfWeek.lastIndex downTo 1 step 2) {
//        println("$index: ${daysOfWeek[index]}")
//    }

    // write your code here
    val count = readln().toInt()
    val list: MutableList<Int> = mutableListOf()
    for (i in 1..count) {
        list.add(readln().toInt())
    }
    val MP = readln()
    val p = MP.first().toString().toInt()
    val m = MP.last().toString().toInt()
    if (list.contains(p) && list.contains(m)) {
        println("YES")
    } else {
        println("NO")
    }
}

