class Solution {
    double euc(int[] point){
        return (point[0] * point[0]) + (point[1] * point[1]);
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(
            (a,b) -> Double.compare(euc(b), euc(a))
        );

        for(int[] point: points){
            q.add(point);
            if(q.size() > k) q.poll();
        }
        int[][] res = new int[k][2];
        int c = 0;
        while(!q.isEmpty()){
            res[c++] = q.poll();
        }

        return res;
    }
}