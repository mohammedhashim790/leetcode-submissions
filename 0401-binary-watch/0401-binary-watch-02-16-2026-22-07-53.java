class Solution {
    public List<String> readBinaryWatch(int t) {
        List<String> ans = new ArrayList<String>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == t)
                    ans.add(h + ":" + (m >= 10 ? m : "0" + m));
            }
        }
        return ans;
    }
}