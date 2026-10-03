class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left = 0, right = 0;
        long count = 0;
        long sum = 0;
        while(right< nums.length){
            sum += nums[right];
            while(sum * (right-left+1) >= k){
                sum -= nums[left];
                left++;
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
}