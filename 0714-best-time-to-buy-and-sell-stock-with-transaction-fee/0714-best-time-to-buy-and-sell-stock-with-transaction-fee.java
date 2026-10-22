class Solution {

    private int helper(int prices[], int days, int n, int buy, int dp[][], int fee){
        if(days == n) return 0;
        if(dp[days][buy] != -1) return dp[days][buy];

        int profit;
        if(buy == 1){
            int buying = helper(prices, days+1, n, 0, dp, fee)-prices[days];
            int not_buy = helper(prices, days+1, n, 1, dp, fee);
            profit = Math.max(buying, not_buy);

        }else{
            int sell = helper(prices, days+1, n, 1, dp, fee)+prices[days]-fee;
            int not_sell = helper(prices, days+1, n,0, dp, fee);
            profit = Math.max(sell, not_sell);
        }
        dp[days][buy] = profit;
        return  dp[days][buy];
    }
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp[][] = new int [n][2];

        for(int i = 0; i< n; i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return helper(prices, 0, n, 1, dp, fee);
    }
}