class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for(List<Integer> res: triangle){
            int min = Integer.MAX_VALUE;
            for(Integer num: res){
                min = Math.min(num, min);
            }
            sum+=min;
        }
        return sum;
    }
}