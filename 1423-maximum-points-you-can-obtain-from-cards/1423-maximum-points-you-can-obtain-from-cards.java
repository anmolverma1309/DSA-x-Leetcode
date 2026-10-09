class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, win = n-k;
        int sum = 0;
        int totsum = 0;
        for(int x : cardPoints) totsum += x;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < n;i++){
            sum += cardPoints[i];
            if(i>= win){
                sum -= cardPoints[i-win];
            }
            if(i>= win-1){
                max = Math.min(sum, max);
            }

        }
        return totsum - max;
    }
}