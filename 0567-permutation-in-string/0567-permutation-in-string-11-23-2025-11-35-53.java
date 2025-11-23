class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];

        int l = s1.length();
        int req = 0;
        for(int i = 0;i < s1.length();i++) {
            s1Count[s1.charAt(i) - 'a']++;
            if(s1Count[s1.charAt(i) - 'a'] == 1) req++;
        }

        System.out.println(req);

        for(int i = 0; i < s2.length();i++){
            int ch = s2.charAt(i) - 'a';
            if(s1Count[ch]!=0){
                int matches = 0;
                int[] s2Count = new int[26];
                for(int j = i; j<s2.length(); j++){
                    ch = s2.charAt(j) - 'a';
                    s2Count[ch]++;
                    if (s1Count[ch] < s2Count[ch]){
                        break;
                    }
                    if(s1Count[ch] == s2Count[ch]) matches++;
                    if(matches == req) return true;
                }
            }
        }

        return false;
    }
}