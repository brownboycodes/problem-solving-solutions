export function narcissistic(value: number): boolean {
  // your code here
  let stringifiedValue: string = value.toString();
  let digits: number = stringifiedValue.length;
  let sum: number = 0;
  for (let v of stringifiedValue) {
    sum = sum + Math.pow(parseInt(v), digits);
  }
  return sum === value;
}
