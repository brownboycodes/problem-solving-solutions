import java.util.*

fun loopSize(n: Node): Int {
    var currentNode: Node = n
    var visited = mutableListOf<Node>()
    while (visited.contains(currentNode) == false) {
        visited.add(currentNode)
        if (currentNode.next == null) break
        currentNode.next?.let { currentNode = it }
    }
    return visited.size - visited.indexOf(currentNode)
}
