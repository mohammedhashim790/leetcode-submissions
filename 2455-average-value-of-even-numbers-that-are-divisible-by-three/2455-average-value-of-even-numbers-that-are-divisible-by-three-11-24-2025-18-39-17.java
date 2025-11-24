class Solution {
    public int averageValue(int[] nums) {
        int res = 0 ;
        int cnt = 0;
        for(int num : nums){
            if(num % 6 == 0) {
                res+=num;
                cnt++;
            }
        }

        return (cnt>1)? res/cnt: res;
    }
}