class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int arr[] = new int[k];
        for(int i = 0; i< nums.length; i++){
            hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);
        }
        
        int maxkey = 0;
        int s = 0;
        while(s< k){
            int max = 0;
            for(int i : hs.keySet()){
                if(hs.get(i) > max){
                    max = hs.get(i);
                    maxkey = i;
                    
                }
            }
            arr[s] = maxkey;
            hs.remove(maxkey);
            s++;
        }
        return arr;
        
    }
}