/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function (operations) {
  let x = 0;
  for (let op of operations) {
    if (op.includes("++") === true) {
      x = x + 1;
    } else {
      x = x - 1;
    }
  }
  return x;
};
