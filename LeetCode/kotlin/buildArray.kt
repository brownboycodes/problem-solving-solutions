class Solution {
    fun buildArray(nums: IntArray): IntArray {
        var ans=mutableListOf<Int>()
        for (i in nums.indices){
            ans.add(nums[nums[i]])
         }
        return ans.toIntArray()
    }
}