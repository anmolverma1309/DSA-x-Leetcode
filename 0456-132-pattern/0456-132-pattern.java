class Solution {
    public boolean find132pattern(int[] nums) {
        Stack <Integer> st = new Stack<>();
        int n =nums.length;
        int sec = Integer.MIN_VALUE;
        for(int i = n-1; i>=0; i--){
            if(nums[i] < sec) return true;
            while(!st.isEmpty() && nums[i] > st.peek()){
                sec = st.pop();   
            }
            st.push(nums[i]);
        }
        return false;
    }
}