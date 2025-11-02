class Solution {
    public int minimumTotal(List<List<Integer>> val) {
        int prev = 0;

        for(int row = val.size()-2;row>=0;row--){
            for(int col = 0;col < val.get(row).size();col++){
                int currVal = val.get(row).get(col);
                val.get(row).set(col, 
                currVal + 
                    Math.min(val.get(row+1).get(col), val.get(row+1).get(col+1)
                ));
            }
        }

        System.out.println(val.get(0).get(0));


        // for(int i = 1;i < val.size(); i++){
        //     List<Integer> row = val.get(i);
        //     System.out.println(prev + " " + row.get(prev) + " " + row.get(prev+1) + " Min : "+Math.min(row.get(prev), row.get(prev+1)));
        //     if(row.get(prev) > row.get(prev+1)){
        //         prev = prev+1;
        //     }
        //     sum+=row.get(prev);
        // }
        return val.get(0).get(0);
    }
}