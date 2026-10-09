class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length, m = queries.length;
        int ans[] = new int [m];
        Arrays.sort(nums);
        int qlen = 0, len = 0;
        int prefix[] = new int[n+1];
        for(int i = 1; i < n+1;i++){
            prefix[i] = prefix[i-1]+ nums[i-1];
        }
        for(int i = 0; i < m;i++){
            for(int j = 0; j < prefix.length;j++){
            if(prefix[j] <= queries[i]){
                len = j;
            }
            ans[i] = len;
            }
        }
        
        return ans;
    }
}