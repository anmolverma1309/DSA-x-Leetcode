class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int max = 0;
        while ( lp< rp){
            int h = Math.min(height[lp], height[rp]);
            int width = rp-lp;
            int curr = h*width;
            max = Math.max(max,curr );
            if (height[lp]< height[rp]){
                lp++;
            }else{
                rp--;
            }
        }return max;
        
    }
}