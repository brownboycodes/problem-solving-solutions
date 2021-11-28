class Solution {
    func finalValueAfterOperations(_ operations: [String]) -> Int {
        var x=0
        for op in operations{
            if op.contains("++"){
                x+=1
            }else{
                x-=1
            }
        }
        return x
        
    }
}