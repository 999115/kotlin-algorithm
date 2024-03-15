class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()

        answer.remove(answer.minOf { it })

        if (answer.size == 0) {
            answer += -1
        }

        return answer.toIntArray()
    }
}