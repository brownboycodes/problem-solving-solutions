class Solution(object):
    def searchInsert(self, nums, target):
        nearest_num = min(nums, key=lambda x: abs(x-target))
        best_postion = nums.index(nearest_num)
        if target > nearest_num:
            best_postion += 1
        return best_postion
