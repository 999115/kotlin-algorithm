class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var incPrice : Long = 0

        for (n in 1..count) {
            incPrice += (price * n)
        }

        if (incPrice > money) {
            answer = (incPrice - money)
        } else return 0

        return answer
    }
}