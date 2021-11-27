function sum(numbers) {
  "use strict";
  if (numbers.length === 0) return 0;
  return numbers.reduce((a, b) => a + b);
}
