class RandomizedSet {

    HashMap<Integer, Integer> hs;
    Random random;
    ArrayList<Integer> list;

    public RandomizedSet() {
        hs = new HashMap<>();
        random = new Random();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hs.containsKey(val)){
            return false;
        }else{
            list.add(val);
            hs.put(val, list.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(hs.containsKey(val)){
            int idx = hs.get(val);
            int last = list.get(list.size()-1);
            list.set(idx,last);
            list.remove(list.size()-1);
            hs.put(last,idx);
            hs.remove(val);
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        int ranidx = random.nextInt(list.size());
        return list.get(ranidx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */