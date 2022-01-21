fun main() {
    println(canCompleteCircuit(intArrayOf(1,2,3,4,5),intArrayOf(3,4,5,1,2)))
    println(canCompleteCircuit(intArrayOf(2,3,4),intArrayOf(3,4,3)))
}

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    var currentRemaining = 0
    var totalRemaining = 0
    var start = 0
    for (i in gas.indices) {
        var remaining = gas[i] - cost[i]
        if (currentRemaining < 0){
            start = i
            currentRemaining = remaining
        }
        else{
            currentRemaining += remaining
        }
        totalRemaining += remaining
    }
    if (totalRemaining < 0)
        return -1
    else
        return start
}