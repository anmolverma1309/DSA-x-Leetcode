class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(i>= k-1){ 
                avg = (double)sum/k;
                max = Math.max(max, avg);
                sum -= nums[i-k+1];
            }
        }return max;
    }
}