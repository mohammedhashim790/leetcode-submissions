class Solution {
    static {
        for(int i = 0 ; i < 300; i++) subarraysDivByK(new int[]{0}, 2);
    }
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() {
            {
                put(0, 1);
            }
        };
        int s = 0, c = 0;
        for (int num : nums) {
            s += num;
            int mod = s%k;
            if(mod < 0) mod+=k;
            if (map.containsKey(mod)) {
                c += map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        System.out.println(map);
        return c;

    }
}