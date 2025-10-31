class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> res = new ArrayList();
       int expected = 0;
       for(int num : nums){
        int index = Math.abs(num) - 1;
        if(nums[index]>0){
            nums[index]*=-1;
        }
       }
       for(int i = 1;i<=nums.length;i++){
        if(nums[i-1]>0){
            res.add(i);
        }
       }
    
       return res; 
    }
}