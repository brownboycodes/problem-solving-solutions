fun maxPower(s: String): Int {
    if (s.length == 1) return 1
    var max_power = 0
    var previous = java.lang.Character.MIN_VALUE
    var c = 0
    for (i in s) {
        if (i == previous) {
            c++
        } else {
            if (c > max_power) {
                max_power = c
            }
            c = 1
        }
        previous = i
    }
    if (c > max_power) {
        max_power = c
    }
    return max_power
}

fun main() {
    println(maxPower("leetcode"))
    println(maxPower("abbcccddddeeeeedcba"))
    println(maxPower("hooraaaaaaaaaaay"))
    println(maxPower("j"))
    println(maxPower("tourist"))
}
