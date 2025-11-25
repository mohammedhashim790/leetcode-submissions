class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2 == 0 || k %5 == 0)
            return -1;

        int l = 0;
        int rem = 0;
        for(int i = 1; i <=k ;i ++){
            rem = (rem * 10 + 1) % k;
            l++;
            if(rem % k == 0) return l;
        }

        return -1;
        
    }
}