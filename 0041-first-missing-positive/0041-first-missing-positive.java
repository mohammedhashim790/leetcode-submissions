class Solution {
    public int firstMissingPositive(int[] nums) {

        int res = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> map = new HashMap();
        for(int num: nums){
            if(num < min && num>0) min = num;
            if(num > max) max = num;

            if(num>0) {
                res^=num;
                map.put(num, 1);
            }
        }
        if(max <=0) return 1;

        for(int i = 1;i<=max;i++){
            if(map.getOrDefault(i,-1) == -1) return i;
        }

        return max+1;
        // System.out.println(min + " \t "  + max);
        // for(;min<=max;min++){
        //     res^=min;
        // }

        // System.out.println(res);

        // return res != 0? res : max+1;
           
    }
}