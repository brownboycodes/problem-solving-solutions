fun dirReduc(arr: Array<String>): Array<String> {
    if (arr.isEmpty()) return arr
    for (i in 0 until arr.size - 1) {
        if (arr[i] == "NORTH" && arr[i + 1] == "SOUTH" ||
                arr[i + 1] == "NORTH" && arr[i] == "SOUTH"
        ) {
            return dirReduc(
                arr.slice(0 until i).plus(arr.slice(i + 2 until arr.size)).toTypedArray()
            )
        }
        if (arr[i] == "EAST" && arr[i + 1] == "WEST" ||
                arr[i + 1] == "EAST" && arr[i] == "WEST"
        ) {
            return dirReduc(
                arr.slice(0 until i).plus(arr.slice(i + 2 until arr.size)).toTypedArray()
            )
        }
    }
    return arr
}

fun main() {
    var a = arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")
    println(dirReduc(a).toList())
}
