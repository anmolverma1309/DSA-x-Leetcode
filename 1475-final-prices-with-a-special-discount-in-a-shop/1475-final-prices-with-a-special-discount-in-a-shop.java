class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int [] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            int curr = prices[i];
            int dis = 0;
            while(!st.isEmpty() && st.peek() > curr){
                st.pop();
            }
            dis = st.isEmpty()?0:st.peek();
            ans[i] = curr-dis;
            st.push(curr);
        }
        return ans;
    }
}