class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var max = mutableListOf<Int>()
        var min = mutableListOf<Int>()

        for (i in 1..n * m) {
            if (n % i == 0 && m % i == 0) {
                max += i
            }
            if (i % n == 0 && i % m == 0) {
                min += i
            }
        }

        var answer = intArrayOf(max.maxOf { it }, min.minOf { it })

        return answer
    }
}