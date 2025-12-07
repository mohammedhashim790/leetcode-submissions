class Solution {
    public int minOperations(int[] nums, int k) {
        int s = 0;
        for(int num: nums) s += num;

        if( s % k == 0) return 0;

        return (s<k)?s: s%k;
        
    }
}