class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int prev = 0;
        long sum = 0;
        for (int num: nums) {
            if (prev == num) continue;
            if (num <= k) {
                k++;
                sum += num;        
            }            
            prev = num;
        }
        // System.out.println(k);
        // System.out.println(sum);
        // System.out.println((1 + k) * k / 2);
        long res = (long)(1 + k) * k / 2 - sum;
        return res;        
    }
}