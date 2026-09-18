class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) return strs[0]
        var prefix = strs[0].toCharArray().toList()

        for (i in 1 until strs.size) {
            val str = strs[i]
            if (prefix.size > str.length) {
                prefix = prefix.take(str.length)
            }

            for (c in 0 until prefix.size) {
                if (prefix[c] != str[c]) {
                    prefix = prefix.take(c)
                    if (c == 0) return ""
                    break
                }
            }
        }

        return String(prefix.toCharArray())
    }
}
