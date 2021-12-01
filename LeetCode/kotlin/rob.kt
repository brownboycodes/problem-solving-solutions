import java.lang.StrictMath.max

fun rob(nums: IntArray): Int {
    if (nums.size == 0) return 0
    if (nums.size == 1) return nums[0]
    var potentialLoot = mutableListOf<Int>(nums[0], max(nums[0], nums[1]))
    for (i in 2..nums.size - 1) {
        potentialLoot.add(max(nums[i] + potentialLoot[i - 2], potentialLoot[i - 1]))
    }

    return potentialLoot.last()
}

fun main() {
    println(rob(intArrayOf(1, 2, 3, 1)))
    println(rob(intArrayOf(2, 7, 9, 3, 1)))
    println(rob(intArrayOf()))
    println(rob(intArrayOf(2, 1, 1, 2)))
    println(rob(intArrayOf(0)))
    println(rob(intArrayOf(1)))
    println(rob(intArrayOf(391, 284, 69, 199, 239, 67, 72, 53, 299, 386, 117, 207, 60)))
}

/*
 * https://leetcode.com/problems/house-robber/
 */