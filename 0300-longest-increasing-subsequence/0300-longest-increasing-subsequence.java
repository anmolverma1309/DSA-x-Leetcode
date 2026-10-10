class Solution {
    private int lcs(int nums[], int ans[]){
        int n = nums.length;
        int m = ans.length;
        int dp[][] = new int[n+1][m+1];

        for(int i = 1; i < n+1;i++){
            for(int j =1; j< m+1;j++){
                if(nums[i-1] == ans[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i][j-1];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public int lengthOfLIS(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums) hs.add(x);
        int ans[] = new int[hs.size()];
        int i = 0;
        for(int x : hs){
            ans[i] = x;
            i++;
        } 
        Arrays.sort(ans);
        return lcs(nums, ans);
    }
}