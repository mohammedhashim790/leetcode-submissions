class Solution {
    static HashMap<Integer, Integer> map = new HashMap<>();

    static boolean isPerfectSquare(int x){
        
        int odd = 1;
        while(x > 0){
            x-=odd;
            odd+=2;
        }
        return x == 0 ;
    }

    static {
        int n = 250;
        for(int i = 1 ;i < n;i++){
            for(int j = i+1; j < n;j++){
                int num = (i * i) + (j * j);
                if(isPerfectSquare(num)){
                    map.put(num, map.getOrDefault(num, 0 ) + 2);
                }
                if(num > (n*n)) break;
            }
        }
    }
    public static int countTriples(int n) {
        int s = 0;
        for(int i = 1; i * i <= n * n ; i++){
            // System.out.println(i * i + " " + map.getOrDefault(i * i,0));
            s+=map.getOrDefault(i * i,0);
        }
        return s;
    }
}