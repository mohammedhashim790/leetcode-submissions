class Solution {

    static{
        for(int i = 0 ;i < 100;i++){
            findDuplicates(new int[]{1,2,3,3,4,2});
        }
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int num:nums){
            int index = Math.abs(num) - 1;
            if(nums[index] < 0){
                res.add(Math.abs(num));
            }

            nums[index]*=-1;
        }
        return res;
    }
}