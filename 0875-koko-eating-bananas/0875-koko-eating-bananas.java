class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();

        int l = 0;
        int r = max;

        while( l <= r){
            int k = (l + r) / 2, totalTime = 0;

            for(int pile:piles){
                totalTime += Math.ceil((double) pile / k);
            }

            if(totalTime <= h){
                max = k;
                r = k - 1;
            }else{
                l = k + 1;
            }
        }

        return max;

    }
}