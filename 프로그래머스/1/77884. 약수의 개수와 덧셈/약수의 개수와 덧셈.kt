class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var listDivisor = mutableListOf<Int>()
        var listSize = mutableListOf<Int>()

        for (n in left..right) {
            for (i in 1..n) {
                if (n % i == 0) {
                    listDivisor += i
                }
            }

            listSize += listDivisor.size

            if ((listSize.last()) % 2 == 0) {
                answer += n
            } else {
                answer -= n
            }

            listDivisor.clear()
        }
        return answer
    }
}