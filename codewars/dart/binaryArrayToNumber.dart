int binaryArrayToNumber(List<int> arr) {
  // your code here
  return int.parse(arr.join(), radix: 2);
}
