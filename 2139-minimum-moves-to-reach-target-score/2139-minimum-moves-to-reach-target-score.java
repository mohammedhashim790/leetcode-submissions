class Solution {
    public int minMoves(int target, int max) {
        int count = 0;
        while(max!=0 && target!=0){
            if(target%2==0){
                target/=2;
                max--;
            }else{
                target--;
            }
            count++;
        }

        System.out.println(target);
        System.out.println(count);

        return target + count - 1;
    }
}