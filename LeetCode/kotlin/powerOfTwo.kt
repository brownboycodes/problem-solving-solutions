import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.ceil

fun main() {
    println(isPowerOfTwo(3))
    println(isPowerOfTwo(16))
}
fun isPowerOfTwo(n: Int): Boolean {
    if (n==0) return false
    return ceil(findPower(n))==floor(findPower(n))
}
fun findPower(n: Int):Double{    
    return log10(n.toDouble())/log10(2.0)
}