fun canPartition(nums: IntArray): Boolean {
    var sum_total = 0
    for (i in nums.indices) {
        sum_total += nums[i]
    }

    if (sum_total % 2 != 0) {
        return false
    }

    var partition = IntArray((sum_total / 2) + 1) { 0 }.toMutableList()

    for (i in 0..(sum_total / 2)) {
        partition[i] = 0
    }

    for (i in nums.indices) {
        for (j in (sum_total / 2) downTo nums[i]) {
            if (partition[j - nums[i]] == 1 || j == nums[i]) {
                partition[j] = 1
            }
        }
    }

    return partition[sum_total / 2] == 1
}

fun main() {
    println(canPartition(intArrayOf(1, 5, 11, 5)))
    println(canPartition(intArrayOf(1, 2, 3, 5)))
}
