class Solution {
    public int findMiddleIndex(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = 0;
        for(int i = 1; i < nums.length;i++){
            ans[i] = ans[i-1] + nums[i-1];
        }
        int suff = 0;
        for(int i = nums.length-1; i >= 0; i--){
            ans[i] -= suff;
            suff += nums[i];
        }
        for(int i = 0; i< nums.length;i++){
            if(ans[i] == 0) return i;
        }
        return -1;
    }
}