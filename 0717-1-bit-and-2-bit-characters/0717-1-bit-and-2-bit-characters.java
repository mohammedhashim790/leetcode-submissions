class Solution {
    public boolean isOneBitCharacter(int[] b) {
        int l = b.length;

        for(int i = 0 ; i < l - 1;i++){
            if(b[i] < 0) continue;

            if(b[i] == 0) b[i]--;

            if(b[i] == 1 && (b[i+1] == 0 || b[i+1] == 1)) {
                b[i]-=2;
                b[i+1]-=2;
            }
        }

        System.out.println(Arrays.toString(b));
        return b[l-1] == 0;
    }
}