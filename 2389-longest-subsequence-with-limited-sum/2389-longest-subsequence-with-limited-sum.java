class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length, m = queries.length;
        int ans[] = new int [m];
        Arrays.sort(nums);
        for(int i = 0; i< queries.length;i++){
            int sum = 0, count = 0;
            for(int j = 0; j < nums.length;j++){
                sum += nums[j];
                if(sum <= queries[i]) count++;
                else break;
            }
            ans[i] = count;
        }
        
        return ans;
    }
}