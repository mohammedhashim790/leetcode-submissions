class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        int val = 0;
        
        List<Boolean> res = new ArrayList();
        for(int i = 0 ; i < nums.length;i++){
            val <<= 1;
            val |= nums[i];
            if(val > Integer.MAX_VALUE / 10 ) val = val % 5;
            res.add(val%5 == 0);
        }

        return res;



    }
}