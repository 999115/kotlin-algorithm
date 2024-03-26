class Solution {
    fun solution(s: String): String {
        var answer = ""
        var words = s.split(" ").toMutableList()
        var word = mutableListOf<Char>()
        for (str in words) {
            word = str.toMutableList()
            for (idx in str.indices) {
                if (idx % 2 == 0) {
                    word[idx] = str[idx].uppercaseChar()
                } else {
                    word[idx] = str[idx].lowercaseChar()
                }
            }
            words[words.indexOf(str)] = word.joinToString("")
        }
        answer = words.joinToString(" ")
        return answer
    }
}