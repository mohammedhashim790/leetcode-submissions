class Solution {
    public int firstMissingPositive(int[] nums) {

        // int res = 0;
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // HashMap<Integer, Integer> map = new HashMap();
        // for(int num: nums){
        //     if(num < min && num>0) min = num;
        //     if(num > max) max = num;

        //     if(num>0) {
        //         res^=num;
        //         map.put(num, 1);
        //     }
        // }
        // if(max <=0) return 1;

        // for(int i = max;i>0;i--){
        //     res^=i;
        // }

        // System.out.println(res);

        int n = nums.length;

        for(int i = 0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i] = n +1;
            }
        }

        for(int i = 0;i<n;i++){
            int num = Math.abs(nums[i]);
            if(num <= n){
                nums[num - 1] = Math.abs(nums[num - 1]) * -1;
            }
        }

        System.out.println(Arrays.toString(nums));

        for(int i = 0;i<n;i++){
            if(nums[i] > 0) return i+1;
        }

        return n+1;
    }
}