class Solution {
    public int largestRectangleArea(int[] n) {
        int l = n.length;
        int max = 0;

        Stack<int[]> s = new Stack<int[]>();


        for( int i = 0 ; i < l; i++){
            int ind = i;
            while(!s.isEmpty() && s.peek()[1] >= n[i]){
                // {index, h}
                int[] top = s.pop();
                // The next block can extend until the values are lower than nums[i];
                ind = top[0];
                max = Math.max(max, top[1] * (i - top[0]));
            }
            s.push(new int[]{ind, n[i]});
        }

        while(!s.isEmpty()){
            int[] top = s.pop();
            max = Math.max(max, top[1] * (l - top[0]));
        }


        // int min = 0;
        // for(int i = 0 ; i < l ; i++){
        //     min = n[i];
        //     for(int j = i;j < l ;j++){
        //         min = Math.min(min, n[j]);
        //         int d = j - i + 1;
        //         int area = min * d;
        //         max = Math.max(area, max);
        //     }
        // }

        return max;
    }
}