class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var number: String = s
        var ansList = mutableListOf<String>()

        for (i in 1..s.length) {
            when (number[0]) {
                'z' -> {
                    number = number.substring(4)
                    ansList += "0"
                }

                'o' -> {
                    number = number.substring(3)
                    ansList += "1"
                }

                't' -> {
                    when (number[1]) {
                        'w' -> {
                            number = number.substring(3)
                            ansList += "2"
                        }

                        else -> {
                            number = number.substring(5)
                            ansList += "3"
                        }
                    }
                }

                'f' -> {
                    when (number[1]) {
                        'o' -> {
                            number = number.substring(4)
                            ansList += "4"
                        }

                        else -> {
                            number = number.substring(4)
                            ansList += "5"
                        }
                    }
                }

                's' -> {
                    when (number[1]) {
                        'i' -> {
                            number = number.substring(3)
                            ansList += "6"
                        }

                        else -> {
                            number = number.substring(5)
                            ansList += "7"
                        }
                    }
                }

                'e' -> {
                    number = number.substring(5)
                    ansList += "8"
                }

                'n' -> {
                    number = number.substring(4)
                    ansList += "9"
                }

                else -> {
                    ansList += number.substring(0..0)
                    number = number.substring(1)
                }
            }
            if (number.isEmpty()) break
        }

        answer = ansList.joinToString("").toInt()

        return answer
    }
}