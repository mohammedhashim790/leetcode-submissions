class Solution {
    // Basic Math
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int index = 0; index < nums.length;index++){
            res += index - nums[index];
        }
        return res;
    }
}