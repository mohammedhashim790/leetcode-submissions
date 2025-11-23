class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for(int num : nums){
            int[] curr = dp.clone();

            // System.out.println("*".repeat(10) + " Num : " + num + " " + "*".repeat(10));

            for(int n : curr){
                int ns = n + num;
                int rem = ns % 3;
                dp[rem] = Math.max(dp[rem], ns);
                // System.out.println(Arrays.toString(dp));
            }
        }

        return dp[0];
    }
}