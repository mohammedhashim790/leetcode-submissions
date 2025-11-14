class Solution {
    public int largestRectangleArea(int[] n) {
        int l = n.length;

        int max = 0;
        int min = 0;
        for(int i = 0 ; i < l ; i++){
            min = n[i];
            for(int j = i;j < l ;j++){
                min = Math.min(min, n[j]);
                int d = j - i + 1;
                int area = min * d;
                max = Math.max(area, max);
            }
        }

        return max;
    }
}