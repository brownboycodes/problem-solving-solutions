def canPartition(nums):
    sum_total = 0
    for i in range(len(nums)):
        sum_total += nums[i]
    if sum_total % 2 != 0:
        return False
    partition = [0] * ((sum_total // 2) + 1)

    for i in range((sum_total // 2) + 1):
        partition[i] = 0

    for i in range(len(nums)):
        for j in range(sum_total // 2, nums[i] - 1, -1):
            if (partition[j - nums[i]] == 1 or j == nums[i]):
                partition[j] = 1

    return partition[sum_total // 2] == 1
