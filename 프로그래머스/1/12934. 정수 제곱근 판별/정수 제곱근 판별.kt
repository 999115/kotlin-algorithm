import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        
        var x : Double = sqrt(n.toDouble())
        
        answer = if (x % 1.0 == 0.0){
            ((x+1)*(x+1)).toLong()
        }else{
            -1
        }
        
        return answer
    }
}