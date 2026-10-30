class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        Stack<Integer> st = new Stack<>();
        long sum = 0;

        for(int i = 0; i<= arr.length; i++){
            while(!st.isEmpty() && (i == arr.length || arr[st.peek()] >= arr[i])){
                int mid = st.pop();
                int leftbound = st.isEmpty()?-1:st.peek();
                int rightbound = i;

                long count = (mid-leftbound) * (rightbound-mid) % mod;
                sum += (count * arr[mid]) %mod;
                sum %= mod;
            }st.push(i);
        }return (int) sum;
    }
}