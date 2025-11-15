class TimeMap {

    HashMap<String, List<Object[]>> map;

    public TimeMap() {
        this.map = new HashMap<>();;
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Object[]{timestamp, value});
    }
    
    public String get(String key, int timestamp) {
        List<Object[]> items = this.map.getOrDefault(key, new ArrayList());

        String res = "";
        int r = items.size()-1;
        int l = 0;

        while(l <= r){
            int mid = (l+r) / 2;

            Object[] item = items.get(mid);
            int t = Integer.parseInt(item[0].toString());
            String val = String.valueOf(item[1]);

            if(t <= timestamp){
                res = val;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */