class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, value -> 
            map[value] = index
        }

        nums.forEachIndexed { index, value -> 
            val secondIndex = map.get(target - value)
            if (secondIndex != null && secondIndex != index) {
                return intArrayOf(index, secondIndex)
            }
        }

        throw Exception("No answer")
    }
}
