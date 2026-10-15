class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            if(i> max) return false;
            max = Math.max(max, i+nums[i]);
        }return true;
        // int n = nums.length;
        // boolean dp[] = new boolean[n];
        // dp[n-1] = true;

        // for(int i = n-2; i>= 0; i--){
            
        //     int step = nums[i];
        //     for(int j = i+1; j<= i+step && j<n; j++){
        //         if(dp[j]){
        //             dp[i] = true;
        //             break;
        //         } 
                
        //     }
        // }
        // return dp[0];
    }
}