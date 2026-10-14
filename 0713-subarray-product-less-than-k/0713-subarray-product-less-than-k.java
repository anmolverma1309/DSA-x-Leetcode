class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int pro = 1;
        for(int j =0; j < nums.length;j++){
            pro *= nums[j];
            while(i<= j && pro >= k){
                pro /= nums[i++];
            }
            count += j-i+1;
        }
        return count;
    }
}