def getDecimalValue(head):
    """
    :type head: ListNode
    :rtype: int
    """
    bin_n = ""
    while head != None:
        bin_n += str(head.val)
        head = head.next
    return int(bin_n, 2)
