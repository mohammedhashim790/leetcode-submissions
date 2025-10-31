class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int length = nums.length;
        int[] res = new int[2];
        int[] map = new int[length - 2];
        int k = 0;
        for(int num: nums){
            if(map[num] == 1){
                res[k++] = num;
            }
            map[num]++;
        }

        return res;
    }
}