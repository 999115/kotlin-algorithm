class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""

        answer =
            s.map {
                (it.toInt() + if (it == ' ') 0 else if (it.toInt() + n > 122) n - 26 else if (it.toInt() < 91 && it.toInt() + n > 90) n - 26 else n).toChar()
            }.joinToString("")

        return answer
    }
}