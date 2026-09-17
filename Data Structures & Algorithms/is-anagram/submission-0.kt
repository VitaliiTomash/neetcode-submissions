class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val dic = IntArray(26)
        s.forEach { char -> 
            dic[char.getIndex()]+=1
        }

        t.forEach { char -> 
            dic[char.getIndex()]-=1
        }

        return dic.none { it != 0 }
    }

    private fun Char.getIndex(): Int = this - 'a'
}
