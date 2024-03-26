import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        answer = n.toString(3)
            .map { it }
            .reversed()
            .joinToString("")
            .toInt(3)

        return answer
    }
}