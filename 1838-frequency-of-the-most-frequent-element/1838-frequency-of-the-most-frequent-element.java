class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0, j = 0;
        long sum = 0;
        int max = 0;
        Arrays.sort(nums);
        while(j < nums.length){
            sum += nums[j];
            while((long)nums[j] * (j-left +1)-sum >k){
                sum -= nums[left];
                left++;
            }
            max = Math.max(max, j-left+1);
            j++;
        }
        return max; 
    }
}