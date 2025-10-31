class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;

        int expected = 0;
        int actual = 0;
        for(int num: nums){
            actual^=num;
        }
        for(int num = 0;num<n;num++){
            expected^=num;
        }

        // Show the difference bit that not common in both numbers
        int diff = (actual ^ expected) & -(actual ^ expected);

        int a = 0, b=0;
        for(int num: nums){
            // Accumulate all the digits again.
            if((num & diff) == 0) a^=num;
            else b^=num;
        }
        for(int num = 0;num<n;num++){
            // Remove repeating numbers.
            if((num & diff) == 0) a^=num;
            else b^=num;
        }
        return new int[]{a,b};
        
    }
}