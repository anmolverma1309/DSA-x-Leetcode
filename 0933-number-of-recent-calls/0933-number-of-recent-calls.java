class RecentCounter {
    int count;
    Queue<Integer> que = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        count = 1;
        if(que.isEmpty()){
            que.add(t);
            return 1;
        } 
        int range = t-3000;
        for(int x: que){
            if(x>=range && x<= t){
                count++; 
            }
        }
        que.add(t);
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */