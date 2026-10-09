class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, win = n-k;
        int sum = 0;
        for(int i = 0; i< k;i++) sum += cardPoints[i];
        int ans  = sum;

        int l = k-1;
        for(int i = n-1; i >= n-k;i--){
            sum -= cardPoints[l--];
            sum += cardPoints[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}