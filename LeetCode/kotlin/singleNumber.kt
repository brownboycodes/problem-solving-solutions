fun main() {
    println(singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    println(singleNumber(intArrayOf(2, 2, 1)))
    println(singleNumber(intArrayOf(1)))
}

fun singleNumber(nums: IntArray): Int {
    var single = 0
    for (num in nums) {
        single = single.xor(num)
    }
    return single
}
