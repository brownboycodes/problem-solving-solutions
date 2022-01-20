fun main() {
    println(minEatingSpeed(intArrayOf(3,6,7,11),8))
    println(minEatingSpeed(intArrayOf(30,11,23,4,20),5))
    println(minEatingSpeed(intArrayOf(30,11,23,4,20),6))
}
fun minEatingSpeed(piles: IntArray, h: Int): Int {
    var sum:Long = 0
    for (pile in piles) sum += pile
    var speed: Long = (sum - 1) / h + 1L
    while (true) {
        if (canFinishEating(piles, h, speed)) return speed.toInt()
        else speed++
    }
}

fun canFinishEating(piles: IntArray, h:Int, speed:Long):Boolean {
    var hour = 0
    for (pile in piles) {
        hour += ((pile - 1) / speed + 1).toInt()
    }
    return hour <= h
}