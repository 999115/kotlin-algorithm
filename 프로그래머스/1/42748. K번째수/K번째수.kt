class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        var list = array.toMutableList()
        var subList = mutableListOf<Int>()

        for (i in commands.indices) {
            subList = list.slice((commands[i][0] - 1)..(commands[i][1] - 1)).toMutableList()
            subList.sort()
            answer += subList[commands[i][2] - 1]
        }

        return answer
    }
}