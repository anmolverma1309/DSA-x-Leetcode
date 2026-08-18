class Solution {
    public int largestInteger(int[] nums, int k) { 
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int x : nums) {
            hs.put(x, hs.getOrDefault(x, 0) + 1);
        }
        if(k == 1){
            int ans = -1;
            for(int x : hs.keySet()){
                if(hs.get(x) == 1){
                    ans = Math.max(ans,x);
                }
            }
            return ans;
        }
        if(k == nums.length){
            int ans = -1;
            for(int x : nums){
                ans = Math.max(x, ans);
            }
            return ans;
        }
        
        int ans = -1;
        if(hs.get(nums[0]) == 1){
            ans = Math.max(ans, nums[0]);
        }
        if(hs.get(nums[nums.length-1]) == 1){
            ans = Math.max(ans, nums[nums.length-1]);
        }
        return ans;
    }
}