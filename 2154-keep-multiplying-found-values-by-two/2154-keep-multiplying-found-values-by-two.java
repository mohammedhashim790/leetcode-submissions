class Solution {
    public int findFinalValue(int[] nums, int org) {
        HashMap<Integer, Integer> map = new HashMap();

        for(int num: nums){
            map.put(num, 1);
        }

        while(map.getOrDefault(org,-1) != -1){
            org*=2;
        }

        return org;

    }
}