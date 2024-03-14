class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789

        for (i in signs.indices) {
            if (signs[i] == false) {
                absolutes[i] *= -1
            }
        }

        answer = absolutes.sum()

        return answer
    }
}