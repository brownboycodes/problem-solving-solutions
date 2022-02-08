function canCompleteCircuit(gas, cost) {
  var currentRemaining = 0;
  var totalRemaining = 0;
  var start = 0;

  for (let i = 0; i < gas.length; i++) {
    var remaining = gas[i] - cost[i];
    if (currentRemaining < 0) {
      start = i;
      currentRemaining = remaining;
    } else {
      currentRemaining += remaining;
    }
    totalRemaining += remaining;
  }

  if (totalRemaining < 0) {
    return -1;
  } else {
    return start;
  }
}
