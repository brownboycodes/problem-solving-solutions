import kotlin.math.pow
fun digPow(n: Int, p: Int): Int {
  var nList=n.toString().split("").filter{it->!it.isNullOrEmpty()}.map{it->it.toInt()}
    var sums=0
    var exp=p
    for(i in nList){
        sums+=i.toDouble().pow(exp).toInt()
        exp++
    }
    println(sums)
  return if (sums%n==0) sums/n else -1
}