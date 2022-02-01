import kotlin.math.*

fun main() {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
    println(maxProfit(intArrayOf(7,6,4,3,1)))
}
fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty()) {
        return 0
     }
    var minPrice = prices.first()
    var profit = 0
    for (i in prices.indices) {
       profit = max(profit, prices[i] - minPrice)
       minPrice = min(minPrice, prices[i])
     }
    
    return profit
           
}