fun getDecimalValue(head: ListNode?): Int {
        var h=head
        var bin=""
        while (h!==null){
            bin+=h.`val`.toString()
            h=h.next
        }
        return bin.toInt(2)
    }