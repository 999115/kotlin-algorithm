class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in numbers.indices) {
            for (j in (i + 1)..(numbers.size - 1)) {
                answer += (numbers[i] + numbers[j])
            }
        }

        return answer.distinct().sorted().toIntArray()
    }
}