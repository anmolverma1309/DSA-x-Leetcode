class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int zerocount= 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zerocount++;
            while(zerocount > 1){
                if(nums[j] == 0) zerocount--;
                j++;
            }
            max = Math.max(max, i-j);
        }
        return max;
    }
}