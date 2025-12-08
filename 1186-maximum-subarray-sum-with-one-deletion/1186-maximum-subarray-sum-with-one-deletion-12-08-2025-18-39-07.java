class Solution {
    public int maximumSum(int[] nums) {

        int l = nums.length;

        int noDel = nums[0];
        int withDel = nums[0];
        int res = nums[0];

        for(int i = 1 ; i < l ;i++){
            withDel = Math.max(withDel + nums[i], noDel);
            noDel = Math.max(noDel + nums[i], nums[i]);
            res = Math.max(res, Math.max(withDel, noDel));
        }

        return res;


        // int[] prefix = new int[l];
        // int[] suffix = new int[l];
        // prefix[0] = nums[0];
        // suffix[l-1] = nums[l-1];
        // int max = Math.max(prefix[0], suffix[l-1]);

        // for(int i = 1;i<l;i++){
        //     prefix[i] = nums[i] + prefix[i-1];
        //     suffix[l - i - 1] = nums[l - i - 1] + suffix[l - i];
        //     max = Math.max(max, nums[i]);
        //     max = Math.max(max, Math.max(prefix[i], suffix[l-i-1]));
            
        // }

        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));
        
        // return max;

    }
}