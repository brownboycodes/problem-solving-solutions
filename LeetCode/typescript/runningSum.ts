function runningSum(nums: number[]): number[] {
  let runningSum: any[] = [];
  let sum: number = 0;
  for (let i = 0; i < nums.length; i++) {
    sum = sum + nums[i];
    runningSum.push(sum);
  }
  return runningSum;
}
