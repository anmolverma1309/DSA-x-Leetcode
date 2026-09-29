class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        int left = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            if(i-left+1 > k){
                sum -= nums[left];
                hs.put(nums[left], hs.get(nums[left])-1);
                if(hs.get(nums[left]) == 0){
                    hs.remove(nums[left]);
                }
                left++;
            }
            if(i-left+1 == k && hs.size() == k){
                max = Math.max(max, sum);
            }
            
        }
        return max;
    }
}