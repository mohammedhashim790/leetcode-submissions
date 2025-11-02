class Solution {
    public String countAndSay(int n) {
        String res = "1";

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
            // System.out.println(builder);
            // System.out.println(res.charAt(iter));
            builder.append(counter + "" + res.charAt(iter));
            // System.out.println(builder);
            res = builder.toString();
        }

        return res.toString();
    }
}