class Solution {
    public int characterReplacement(String s, int k) {
        // From neetcode
        int max = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap();

        int l = 0, r = 0;
        while(r < s.length()){
            Character ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch , 0) + 1);
            max = Math.max(max, map.get(ch));

            // to be true it must be (r-l+1)<= k;
            while( (r - l + 1 ) - max > k){
                Character c = s.charAt(l);
                map.put(c, map.get(c) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    }
}