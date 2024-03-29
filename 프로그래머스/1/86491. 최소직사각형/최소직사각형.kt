class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var verList = mutableListOf<Int>()
        var horiList = mutableListOf<Int>()

        for (arr in sizes) {
            verList += arr.maxOf { it }
            horiList += arr.minOf { it }
        }

        verList.sort()
        horiList.sort()

        return verList.maxOf { it } * horiList.maxOf { it }
    }
}