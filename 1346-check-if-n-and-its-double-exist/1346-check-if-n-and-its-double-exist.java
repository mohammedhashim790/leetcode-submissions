class Solution {
    static{
        for(int i = 0 ; i < 300;i++) checkIfExist(new int[2]);
    }
    public static boolean checkIfExist(int[] n) {
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