class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int curr =  0;
        int max = 0;
        for(int i = 0; i < k; i++){
            curr += nums[i];
        }
        max = curr;
        for(int i = k; i < nums.length; i++){
            curr = curr - nums[i-k] + nums[i];
            max = Math.max(curr, max);
        }
        return (double)max/k;
    }
}