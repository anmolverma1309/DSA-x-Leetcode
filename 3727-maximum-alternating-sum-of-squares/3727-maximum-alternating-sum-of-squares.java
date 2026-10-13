class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sq = 0;
        int ans[] = new int[nums.length];
        for(int i = 0; i< nums.length;i++) ans[i] = nums[i] * nums[i];
        Arrays.sort(ans);
        for(int num: ans) sq+= num;
        for(int i = 0; i< ans.length/2; i++){
            sq -= ans[i]*2L;
        }
        return sq;
    }
}