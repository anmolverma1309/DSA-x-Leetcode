class Solution {
    public long subArrayRanges(int[] nums) {
        long res = 0;
        int n = nums.length;
        Stack <Integer> st = new Stack<>();

        for(int i = 0; i<= nums.length; i++){
            while(!st.isEmpty() && nums[st.peek()] > (i==n? Integer.MIN_VALUE:nums[i])){
                int mid = st.pop();
                int leftbound = st.isEmpty()?-1:st.peek();
                int rightbound = i;
                res -= (long) nums[mid] * (mid-leftbound) * (rightbound-mid);
            }
            if(i<n) st.push(i);
        }
        st.clear();

        //max
        for(int i = 0; i<= nums.length; i++){
            while(!st.isEmpty() && (i==n || nums[st.peek()] < nums[i])){
                int mid = st.pop();
                int leftbound = st.isEmpty()?-1:st.peek();
                int rightbound = i;
                res += (long) nums[mid] * (mid-leftbound) * (rightbound-mid);
            }
            st.push(i);
        }
        return res;
    }
}