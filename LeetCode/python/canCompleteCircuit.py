def canCompleteCircuit(gas, cost):
    currentRemaining = 0
    totalRemaining = 0
    start = 0

    for i in range(len(gas)):
        remaining = gas[i] - cost[i]
        if currentRemaining < 0:
            start = i
            currentRemaining = remaining

        else:
            currentRemaining += remaining

        totalRemaining += remaining

    if totalRemaining < 0:
        return -1
    else:
        return start
