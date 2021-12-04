var maxProduct = function (nums) {
  let largestProduct = nums[0];
  for (let i = 0; i < nums.length; i++) {
    let currentProduct = nums[i];
    for (let j = i + 1; j < nums.length; j++) {
      largestProduct = Math.max(largestProduct, currentProduct);
      currentProduct = currentProduct * nums[j];
    }
    largestProduct = Math.max(largestProduct, currentProduct);
  }
  return largestProduct;
};
