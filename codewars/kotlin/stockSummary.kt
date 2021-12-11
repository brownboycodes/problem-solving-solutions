fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
    if (lstOfArt.isEmpty() || lstOfCat.isEmpty()) {
        return ""
    }
    var totalQuantities = mutableListOf<Int>()
    for (category in lstOfCat) {
        var filteredQuantityList =
            lstOfArt.filter { it -> it[0].toString() == category }.map { it ->
                it.split(" ")[1].toInt()
            }
        totalQuantities.add(filteredQuantityList.sum())
    }

    // pattern "(A : 200) - (B : 1140)"
    var result = ""
    for (i in lstOfCat.indices) {
        result += "(${lstOfCat[i]} : ${totalQuantities[i]})"
        if (i < lstOfCat.size - 1) {
            result += " - "
        }
    }
    return result
}

fun main() {
    println(
        stockSummary(
            arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"),
            arrayOf("A", "B")
        )
    )
    println(
        stockSummary(
            arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"),
            arrayOf("A", "B", "C", "D")
        )
    )
}
