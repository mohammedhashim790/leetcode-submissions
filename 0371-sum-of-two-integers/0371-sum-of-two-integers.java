class Solution {

    public int getSum(int a, int b){
        int carry = 0;
        int res = 0;
        for(int i = 0 ;i < 32;i++){
            int aBit = (a >> i) & 1;
            int bBit = (b >> i) & 1;
            int bit = aBit ^ bBit ^ carry;
            carry = ((a >> i) & (b >> i) & 1) == 1?2:0;
            // System.out.println("Bit : " + bit);
            if(bit!=0){
                res |= ( 1 << i);
            }
        }
        // System.out.println(res);
        // System.out.println(Integer.toBinaryString(res));
        return res;

    }

    // public int getSum(int a, int b) {
    //     while(b!=0){
    //         int carry = (a & b) << 1;
    //         a^=b;
    //         b = carry;
    //     }
    //     return a;
    // }
}