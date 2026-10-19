class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = prices[0];
        for (int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                minprice = Math.min(minprice, prices[i]);
                maxprofit +=  prices[i]- prices[i-1];
            }
        }
        return maxprofit;
    }
}