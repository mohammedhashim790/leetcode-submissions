class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0 ; i < m;i++){
            int fs = n;
            int left = 0, right = fs - 1;

            while(left <= right){
                int mid = (left + right) / 2;
                if(grid[i][mid] >= 0){
                    left = mid + 1;
                }
                else{
                    fs = mid;
                    right = mid - 1;
                }
            }
            count+= (n - fs);
        }
        //    O(m*n)
        // for(int i = 0 ; i < m; i++){
        //     for(int j = 0 ;j < n; j++){
        //         if(grid[i][j] < 0) count++;
        //     }
        // }

        return count;
    }
}