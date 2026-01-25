class Solution {
    public int arrayPairSum(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue();

        for(int num: nums){
            q.add(num);
        }
        int m = 0;
        while(!q.isEmpty()){
            m+=Math.min(q.poll(), q.poll());
        }

        return m;
    }
}