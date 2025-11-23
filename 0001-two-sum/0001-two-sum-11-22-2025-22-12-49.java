class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        
        for(int index = 0;index < nums.length;index++){
            int diff = target - nums[index];
            if(res.containsKey(diff)){
                return new int[]{index, res.get(diff)};
            }
            res.putIfAbsent(nums[index], index);
        }

        return new int[]{};
    }
}

