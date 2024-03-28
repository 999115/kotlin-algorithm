class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        for (i in 0..t.length - p.length) {
            var sbstr = t.substring(i, i + p.length)
            if (sbstr.toLong() <= p.toLong()) {
                answer++
            }
        }

        return answer
    }
}