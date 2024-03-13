class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = x.toString().map{it.toInt()-48}.sum()
        println(sum)
        if(x%sum==0){
            answer = true
        }else{
            answer = false
        }
        return answer
    }
}