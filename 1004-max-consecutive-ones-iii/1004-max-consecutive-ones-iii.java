class Solution {
    public int longestOnes(int[] nums, int k) {
       int zerocount = 0;
       int i = 0;
       int j = 0; 
       int max = 0;
       while(j<nums.length){
        if(nums[j] == 0){
            zerocount++;
        }
        while(zerocount> k){
            if(nums[i] == 0) zerocount--;
            i++;
        }
        max = Math.max(max, j-i+1);
        j++;
       }
       return max;
    }
}