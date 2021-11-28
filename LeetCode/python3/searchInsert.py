class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        nearest_num = min(nums, key=lambda x: abs(x-target))
        best_postion = nums.index(nearest_num)
        if target > nearest_num:
            best_postion += 1
        return best_postion
