def loop_size(node):
    visited = []
    while node != None:
        if node in visited:
            break
        visited.append(node)
        node = node.next
    return len(visited)-visited.index(node)
