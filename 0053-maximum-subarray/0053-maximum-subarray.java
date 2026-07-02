class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        int maxelement = Integer.MIN_VALUE;
        for (int i =0; i< nums.length; i++){
            currsum += nums[i];
            if (currsum<0){
                currsum = 0;
            }
            max = Math.max(max, currsum);
            maxelement = Math.max(maxelement, nums[i]);
            if (maxelement<0){
                max = maxelement;
            }
            
        }
        return max;
    }
}