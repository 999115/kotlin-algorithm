class Solution {
    fun solution(n: Int): Int {
        var answer = n.toString().map{it.toInt()-'0'.toInt()}.sum()
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println(answer)
        

        return answer
    }
}