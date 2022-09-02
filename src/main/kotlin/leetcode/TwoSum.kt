package leetcode

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var s: String = "23"
        val i: Int = 2
        val c: Char = 'd'

        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, i ->
            val goal = target - i
            println("i $i")
            println("index $index")
            println("goal $goal")
            println("map[goal] ${map[goal]}")

            if (map[goal] != null) return intArrayOf(map[goal]!!, index)
            map[i] = index
        }
        return intArrayOf(-1, -1)
    }

    private fun twoSum2() {
        //        for (num1 in nums.indices step 2){
        //            println(num1)
        //        }
        //        for (num1 in nums.indices) {
        //            println(num1)
        //        }
        //        for (num1 in 1..10) {
        //            println(num1)
        //        }
        //        for (num1 in nums) {
        //            println(num1)
        //        }
    }
}

fun main() {
    var result = TwoSum().twoSum(intArrayOf(3, 7, 2), 9)
    println(result.toList())
}