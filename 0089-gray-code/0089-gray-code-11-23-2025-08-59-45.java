class Solution { 
    
    public List<Integer> grayCode(int n) {
        n = (1 << n);        
        List<Integer> arr = new ArrayList(n);
        int start = arr.size();
        for(int i = 0; i < n;i++){
            arr.add(i ^ (i >> 1));
        }
        return arr.subList(0,n);
    }
}