class Solution {
    static{
        for(int i = 0 ;i < 300;i++) countAndSay(1);
    }
    public static String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        for(int i = 1;i<n;i++){
            int length = res.length()-1;
            int counter = 1;
            int iter = 0;
            StringBuilder builder = new StringBuilder();
            while(iter < length){
                if(res.charAt(iter) == res.charAt(iter+1)){
                    counter++;
                }
                else{
                    builder.append(counter + "" + res.charAt(iter));
                    counter = 1;
                }
                iter++;
            }
            builder.append(counter + "" + res.charAt(iter));
            res = new StringBuilder(builder);
        }

        return res.toString();
    }
}