class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0;
        int next = 0;
        int max = 0;

        for(int num:nums){
            if(num == 0){
                max = Math.max(prev+next, max);
                prev = next;
                next = 0;
                continue;
            }
            next++;
        }
        max = Math.max(prev+next, max);
        return max == nums.length ? max - 1: max;
    }
}