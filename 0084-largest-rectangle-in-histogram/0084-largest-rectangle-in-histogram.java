class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        int leftmax[] = new int[n], rightmax[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            if(st.isEmpty()) leftmax[i] = -1;
            else leftmax[i] = st.peek();
            st.push(i);
        }

        Stack<Integer> s = new Stack<>();

        for(int i = n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) s.pop();
            if(s.isEmpty()) rightmax[i] = n;
            else rightmax[i] = s.peek();
            s.push(i);
        }
        int maxarea = 0;
        for(int i = 0; i< n; i++){
            int hei = heights[i];
            int width = rightmax[i] - leftmax[i]-1;
            int area = hei*width;
            maxarea = Math.max(maxarea,area);
        }return maxarea;
    }
}