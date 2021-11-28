class Solution {
    func runningSum(_ nums: [Int]) -> [Int] {
        var runningSum=[Int]()
        var sum=0
        for i in 0..<nums.count{
            sum=sum+nums[i]
            runningSum.append(sum)
        }
        return runningSum
    }
}