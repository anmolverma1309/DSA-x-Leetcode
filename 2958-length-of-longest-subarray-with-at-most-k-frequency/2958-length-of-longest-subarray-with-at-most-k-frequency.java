class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int left = 0, right = 0;
        int max = 0;
        while(right<nums.length){
            hs.put(nums[right],hs.getOrDefault(nums[right],0)+1);
            while(hs.get(nums[right]) > k){
                hs.put(nums[left], hs.get(nums[left])-1);
                left++;
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
}