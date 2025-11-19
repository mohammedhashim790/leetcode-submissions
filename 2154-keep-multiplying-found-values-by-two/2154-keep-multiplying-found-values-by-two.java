class Solution {
    public int findFinalValue(int[] nums, int org) {
        HashMap<Integer, Integer> map = new HashMap();
        int res = 0;
        for(int num: nums){
            map.put(num, 1);
            res^=num;
        }

        System.out.println(res);
        System.out.println(Integer.toBinaryString(res));
         
        while(map.getOrDefault(org,-1) != -1){
            org*=2;
        }

        return org;

    }
}