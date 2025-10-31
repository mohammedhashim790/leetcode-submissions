class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int length = nums.length;

        int[] map = new int[length];

        List<Integer> res = new ArrayList<Integer>();

        for(int num: nums){
            if(map[num-1] == 1){
                res.add(num);
            }
            map[num-1]++;
        }

        return res;
    }
}