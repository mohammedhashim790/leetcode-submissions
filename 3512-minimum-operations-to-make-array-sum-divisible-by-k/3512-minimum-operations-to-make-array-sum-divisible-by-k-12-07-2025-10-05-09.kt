class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        val sum = nums.sum()
        return if(sum % k == 0){
            0
        }else{
            if(sum < k) {sum}
            else{sum % k}
        }
    }
}