class Solution {
    fun solution(s: String): String {
        var answer = ""

        val list = s.toMutableList()
        val halfNum: Int = list.size / 2

        if (list.size % 2 == 0) {
            var list2 = mutableListOf(list[halfNum - 1], list[halfNum])
            answer = list2.joinToString("")
        } else {
            answer = list[halfNum].toString()
        }

        return answer
    }
}