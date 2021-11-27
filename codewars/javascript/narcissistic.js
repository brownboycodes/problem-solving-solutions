function narcissistic(value) {
  // Code me to return true or false
  value = value.toString();
  let digits = value.length;
  let sum = 0;
  for (let v of value) {
    sum = sum + Math.pow(parseInt(v), digits);
  }
  return sum === parseInt(value);
}
