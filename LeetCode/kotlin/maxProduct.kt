import java.lang.StrictMath.max

fun maxProduct(nums: IntArray): Int {
    var largestProduct = nums[0]
    for (i in nums.indices) {
        var currentProduct = nums[i]
        for (j in (i + 1)..(nums.size - 1)) {
            largestProduct = max(largestProduct, currentProduct)
            currentProduct *= nums[j]
        }
        largestProduct = max(largestProduct, currentProduct)
    }
    return largestProduct
}
