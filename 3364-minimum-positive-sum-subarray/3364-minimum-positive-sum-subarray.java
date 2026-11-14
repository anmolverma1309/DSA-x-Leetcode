class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE, n = nums.size();
        for(int i = 0; i<n ; i++){
            int sum = 0;
            for(int j = i; j<n && j-i+1<=r; j++){
                sum += nums.get(j);
                if(j-i+1>=l && sum>0){
                    ans = Math.min(ans, sum);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}