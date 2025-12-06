class Solution {
    public int countPartitions(int[] nums) {

        for(int i = 1 ; i <nums.length;i++) nums[i]+=nums[i-1];


        return (nums[nums.length-1] & 1) != 0? 0 : nums.length-1;

        // int l = nums.length;
        // int[] pref = new int[l];
        // int[] suff = new int[l];
        // int c = 0;
        // pref[0] = nums[0];
        // suff[l-1] = nums[l-1];

        // for(int i = 1;i<l;i++){
        //     pref[i] = pref[i-1] + nums[i];
        //     suff[l - i - 1] = suff[l - i] + nums[l - i -1];
        // }
        // for(int i = 0;i<l-1;i++){
        //     if((pref[i] - suff[i+1]) % 2==0) c++;
        // }
        
        // return c;


    }
}