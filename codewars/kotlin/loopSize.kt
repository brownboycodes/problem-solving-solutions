import java.util.*

fun loopSize(n: Node): Int {
    var currentNode: Node = n
    var visited = mutableListOf<Node>()
    while (currentNode != null) {
        if (visited.contains(currentNode)) {
            break
        }
        visited.add(currentNode)
        if (currentNode.next == null) break
        currentNode.next?.let { currentNode = it }
    }
    return visited.size - visited.indexOf(currentNode)
}
