class Solution {
    public boolean checkIfExist(int[] n) {
        Set<Integer> set = new HashSet();
        for(int num: n){
            if((num%2==0  && set.contains(num/2)) || set.contains(num * 2)){
                return true;
            }
            set.add(num);
        }


        return false;

    }
}