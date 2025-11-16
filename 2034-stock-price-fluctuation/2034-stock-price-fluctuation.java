


class StockPrice {

    HashMap<Integer, Integer> map;
    int maxT = Integer.MIN_VALUE;
    // for insertion in O(1) and retrieval in O(N)
    public StockPrice() {
        map = new HashMap<Integer, Integer>();
    }
    
    public void update(int timestamp, int price) {
        map.put(timestamp, price);
        maxT = Math.max(maxT, timestamp);
    }
    
    public int current() {
        return map.get(maxT);
    }
    
    public int maximum() {
        return map.values().stream().max(Integer::compareTo).orElse(null);
    }
    
    public int minimum() {
        return map.values().stream().min(Integer::compareTo).orElse(null);
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */