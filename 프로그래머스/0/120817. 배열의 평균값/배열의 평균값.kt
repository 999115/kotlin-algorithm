class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        answer = numbers.map{it.toDouble()}.sum()/numbers.size
        return answer
    }
}