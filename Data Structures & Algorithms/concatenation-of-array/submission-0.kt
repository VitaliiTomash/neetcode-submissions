class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val answ = IntArray(n * 2)
        nums.forEachIndexed {index, num -> 
            answ[index] = num
            answ[index+n] = num
        }

        return answ
    }
}
