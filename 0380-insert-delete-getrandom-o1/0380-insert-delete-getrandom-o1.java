class RandomizedSet {
    HashMap<Integer, Integer> hs;
    public RandomizedSet() {
        hs = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(hs.containsKey(val)){
            return false;
        }else{
            hs.put(val, hs.getOrDefault(val,0)+1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(hs.containsKey(val)){
            hs.remove(val);
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        Random random = new Random();
        int target = random.nextInt(hs.size());
        int i = 0;
        for (int x : hs.keySet()) {
        if (i == target) return x;
        i++;
        }
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */