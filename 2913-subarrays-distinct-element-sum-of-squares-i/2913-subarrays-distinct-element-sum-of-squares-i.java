class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        
        for(int i = 0; i <nums.size();i++){
            HashSet <Integer> hs = new HashSet();
            int count = 0;
            for(int j = i; j< nums.size();j++){
                hs.add(nums.get(j));
                count = hs.size();
                ans += count * count;
            }
            
        }
        
        return ans;
    }
}