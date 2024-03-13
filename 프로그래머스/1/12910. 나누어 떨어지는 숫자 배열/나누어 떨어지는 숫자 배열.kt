class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer : MutableList<Int> = mutableListOf()

        for (num in arr) {
            if (num % divisor == 0) {
                answer.add(num)
            }
        }
        answer.sort()
        if (answer.size == 0) {
            return intArrayOf(-1)
        }
        return answer.toIntArray()
    }
}