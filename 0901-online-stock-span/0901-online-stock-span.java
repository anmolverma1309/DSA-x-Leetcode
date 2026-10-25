class StockSpanner {

    ArrayList<Integer> arr = new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        arr.add(price);
        int ans = 0;
        for(int i = arr.size()-1; i >= 0; i--){
            if(arr.get(i) <= price) ans++;
            else break;
        }
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */