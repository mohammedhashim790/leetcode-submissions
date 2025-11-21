class Solution {
    public int countPalindromicSubsequence(String s) {
        int l = s.length();
        int count = 0;

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        
        for(int i = 0 ; i < s.length();i++){
            int num = s.charAt(i) - 'a';
            if(first[num] == -1) first[num] = i;
            last[num] = i;
        }

        for(int i = 0 ; i < 26;i++){
            boolean[] seen = new boolean[26];
            for(int j = first[i]+1;j>=0 && j<last[i];j++){
                int ch = s.charAt(j) - 'a';
                if(!seen[ch]) {
                    seen[ch] = true;
                    count++;
                }
            }
        }

        return count;

        // TLE for length > 5K
        // HashMap<String, Integer> map = new HashMap();
        // for (int i = 0; i < l-2; i++) {
        //     int k = l - 1;
        //     while (k > i && s.charAt(k) != s.charAt(i))
        //         k--;
        //     if (k <= i)
        //         continue;
        //     int iter = k - 1;
        //     char[] str = new char[3];
        //     str[0] = s.charAt(i);
        //     str[2] = s.charAt(k);
        //     while (iter > i) {
        //         str[1] = s.charAt(iter);
        //         map.putIfAbsent(Arrays.toString(str), 1);
        //         iter--;
        //     }
        //     count += (k - i - 1);
        // }
        // return map.size();
    }
}