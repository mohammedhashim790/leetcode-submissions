class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> b - a);


        for(int num:nums){
            q.add(num);
            // if(q.size() > k) q.poll();
        }

        System.out.println(q);

        while(k>1){
            q.poll();
            k--;
        }
        System.out.println(q);
        return q.poll();

        
    }
}