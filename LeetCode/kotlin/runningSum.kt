class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var runningSum=mutableListOf<Int>()
        var sum=0
        for(i in nums.indices){
            sum=sum+nums[i]
            runningSum.add(sum)
        }
        return runningSum.toIntArray()
    }
}