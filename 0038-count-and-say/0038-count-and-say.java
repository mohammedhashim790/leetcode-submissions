class Solution {
    final static HashMap<Integer,String> map = new HashMap<Integer, String>();
    static{
        for(int i = 15 ;i<=30;i++) countAndSay(i);
    }
    public static String countAndSay(int n) {

        if(map.containsKey(n)){
            return map.get(n);
        }
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
        map.put(n, res.toString());
        return res.toString();
    }
}