class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var numList = phone_number.toMutableList()

        for (i in 0..(numList.size - 5)) {
            numList[i] = '*'
        }

        answer = numList.joinToString("")

        return answer
    }
}