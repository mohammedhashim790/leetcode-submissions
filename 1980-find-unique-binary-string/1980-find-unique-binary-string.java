class Solution {

    List<String> results = new ArrayList<String>();

    public void genBinaries(String res, int length){
        if(res.length() == length) {
            results.add(res);
            return;
        }
        genBinaries(res+"0",length);
        genBinaries(res+"1", length);
    }

    public String findDifferentBinaryString(String[] nums) {
        // genBinaries(new String(), nums[0].length());
        // // System.out.println(results);
        // for(String res: nums){
        //     results.remove(res);
        // }
        // return results.get(0);
        StringBuilder res = new StringBuilder();
        for(int index = 0;index<nums.length;index++){
            Character ch = nums[index].charAt(index);
            res.append(ch == '0'? '1' : '0');
        }
        return res.toString();

    }
}