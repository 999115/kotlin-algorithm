class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var kim = seoul.indexOf("Kim")
        
        answer = "김서방은 ${kim}에 있다"
        
        return answer
    }
}