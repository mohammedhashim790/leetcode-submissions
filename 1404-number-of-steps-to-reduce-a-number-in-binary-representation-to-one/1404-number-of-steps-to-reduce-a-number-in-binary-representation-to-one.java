class Solution {

    public int numSteps(String s) {
        int cnt = 0;
        int carry = 0;
        for(int i = s.length()-1; i>0;i--){
            int ch = s.charAt(i) - '0';
            if(ch + carry == 0){
                cnt++;
                carry = 0;
            }
            else if(ch + carry == 2){
                cnt++;
                carry=1;
            }else{
                cnt+=2;
                carry=1;
            }
        }
        if(carry==1) cnt++;
        return cnt;

    }
}