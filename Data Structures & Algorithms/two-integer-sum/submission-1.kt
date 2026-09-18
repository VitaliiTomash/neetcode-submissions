class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (left in 0..<nums.size) {
            for (right in nums.size-1 downTo left+1) {
                val sum = nums[left] + nums[right]
                if (sum == target)
                    return intArrayOf(left, right)
            }
        }

        throw Exception("No answer")
    }
}
