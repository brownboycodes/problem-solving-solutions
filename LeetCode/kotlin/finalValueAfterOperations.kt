class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x=0
        for (op in operations){
            if ("++" in op){
                x=x+1
            }else{
                x=x-1
            }
        }
           
        return x
    }
}