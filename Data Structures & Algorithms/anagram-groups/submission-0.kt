class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        strs.forEach { word ->
            val key = word.generateKey()
            val list = map.getOrDefault(key, mutableListOf<String>())
            list.add(word)
            map[key] = list
        }

        return map.values.map { it.toList() }
    }

    private fun String.generateKey(): String {
        val array = IntArray(26)
        this.forEach { char ->
            array[char.getIndex()]+=1
        }
        val sb = StringBuilder()
        array.forEachIndexed {index, value -> 
            if (value > 0) {
                sb.append(index.getChar())
                sb.append(value)
            }
        }

        return sb.toString()
    }

    private fun Char.getIndex(): Int = this - 'a'
    private fun Int.getChar(): Char = (this + 'a'.toInt()).toChar()
}
