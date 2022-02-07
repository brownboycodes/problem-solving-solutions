fun findTheDifference(s: String, t: String): Char {
    var s2=s.toCharArray().sorted()
    var t2=t.toCharArray().sorted()
   	for (i in s2.indices) {
        if (s2[i] != t2[i]) {
           return t2[i]
         }
     }
    return t2.last()
}

fun main() {
    println(findTheDifference("abcd","abcde"))
    println(findTheDifference("","y"))
}