class Solution {
    fun solution(s: String): Boolean {
        var answer = false
        var list = s.toList().map { it.toInt() }

        for (i in list) {
            if (i >= 58) {
                return answer
            }
        }

        if (s.length == 4 || s.length == 6) {
            return true
        }

        return answer
    }
}