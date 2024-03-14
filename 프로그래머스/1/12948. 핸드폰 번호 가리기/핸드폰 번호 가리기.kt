class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var star = Array(phone_number.length-4) {"*"}
        answer = star.toList().joinToString("") + phone_number.takeLast(4)
        
        // for (i in 0..numList.size - 5) {
        //     numList = numList.replace(numList[i], '*')
        // }

        return answer
    }
}