fun main() {
    println(canPlaceFlowers(intArrayOf(1,0,0,0,1),1))
    println(canPlaceFlowers(intArrayOf(1,0,0,0,1),2))
}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
	var zeros = 1
    var newFlowers = n
    for(flowers in flowerbed){
        if(flowers == 0){
            zeros++
        }else{
            newFlowers -= (zeros - 1) / 2
            if(newFlowers <= 0) return true
            zeros = 0
        }
    }
    newFlowers -= zeros / 2
    return newFlowers <= 0        
}