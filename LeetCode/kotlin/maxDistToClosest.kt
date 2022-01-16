import kotlin.math.*

fun main() {
    println(maxDistToClosest(intArrayOf(1,0,0,0,1,0,1)))
    println(maxDistToClosest(intArrayOf(0,1)))
}
fun maxDistToClosest(seats: IntArray): Int {
 	  var prev = -1
    var next = 0
    var n = seats.size
    var ans = 0
    
    for (i in seats.indices) {
        if (seats[i] == 1) {
            prev = i
          } else {
              while (next < n && seats[next] == 0 || next < i) {
                next++
              }
              var left = if(prev == -1) n else (i - prev)
              var right = if(next == n) n else (next - i)
              ans = max(ans, min(left, right))
            }
        }
    return ans 
 }