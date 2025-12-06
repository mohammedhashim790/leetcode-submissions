class Solution {
    public int maxSum(int[] nums) {
        int s = 0;
        Set<Integer> map = new HashSet();
        int max = Integer.MIN_VALUE;

        for(int num: nums){
            if(map.contains(num)) continue;
            if(num>=0) s+=num;
            max = Math.max(max, num);
            map.add(num);
        }

        return (max <= 0 ) ? max : s;
        
    }
}