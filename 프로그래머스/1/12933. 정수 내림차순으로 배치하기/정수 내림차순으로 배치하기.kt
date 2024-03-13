class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        
        answer = n.toString()
            .toMutableList()
            .sortedDescending()
            .joinToString("")
            .toLong()
        
        return answer
    }
}