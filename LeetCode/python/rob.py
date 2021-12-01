#   https://leetcode.com/problems/house-robber/

def rob(nums):
    if len(nums) == 0:
        return 0
    if len(nums) == 1:
        return nums[0]
    potential_loot = (nums[0], max(nums[0], nums[1]))
    for i in range(2, len(nums)):
        potential_loot.append(
            max(nums[i]+potential_loot[i-2], potential_loot[i-1]))
    return potential_loot[-1]


if __name__ == '__main__':
    print(rob([1, 2, 3, 1]))
    print(rob([2, 7, 9, 3, 1]))
    print(rob([]))
    print(rob([12, 74, 50, 84, 105, 303, 5, 282, 276, 289, 293, 133, 60, 56, 10, 279, 245, 272, 209, 213, 11, 50, 5, 207, 323, 172, 383, 127, 264, 183, 92, 8, 201, 145, 370, 330, 330, 206, 322, 149, 192, 139, 345, 40, 5, 298, 349, 162, 137, 107,
          133, 130, 386, 63, 198, 348, 380, 182, 398, 357, 129, 181, 114, 302, 66, 259, 106, 90, 133, 277, 119, 118, 158, 99, 258, 358, 278, 87, 57, 257, 139, 315, 15, 339, 351, 297, 88, 391, 284, 69, 199, 239, 67, 72, 53, 299, 386, 117, 207, 60]))
    print(rob([2, 1, 1, 2]))
    print(rob([0]))
    print(rob([1]))
    print(rob([4, 1, 2, 7, 5, 3, 1]))
