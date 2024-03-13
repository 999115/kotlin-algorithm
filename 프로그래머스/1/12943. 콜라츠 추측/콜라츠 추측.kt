class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var collatz = num.toLong()

        for (i in 0..499) {
            when {
                collatz == 1L -> return i
                collatz % 2 == 0L -> collatz /= 2
                else -> collatz = collatz * 3 + 1
            }
        }
        return -1
    }
}