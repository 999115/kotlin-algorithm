class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        answer = s.map {it.toInt()}
            .toList()
            .sortedDescending()
            .map {it.toChar()}
            .joinToString("")
        
        return answer
    }
}