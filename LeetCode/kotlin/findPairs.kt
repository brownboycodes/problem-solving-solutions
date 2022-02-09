fun main() {
    println(findPairs(intArrayOf(3, 1, 4, 1, 5), 2))
    println(findPairs(intArrayOf(1, 2, 3, 4, 5), 1))
}

fun findPairs(nums: IntArray, k: Int): Int {
    if (nums.isEmpty() || k < 0) return 0
    nums.sort()
    var pair = 0
    var i = 0
    var j = 1
    while (j < nums.size) {
        var diff = nums[j] - nums[i]
        if (j <= i || diff < k) {
            j++
        } else if ((i > 0 && nums[i] == nums[i - 1]) || diff > k) {
            i++
        } else {
            pair++
            i++
        }
    }
    return pair
}
