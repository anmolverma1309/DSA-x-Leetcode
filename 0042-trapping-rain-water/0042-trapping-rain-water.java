class Solution {
    public int trap(int[] height) {
        //left max
        int left_max[]= new int[height.length];
        left_max[0] = height[0];
        for (int i = 1; i< height.length; i++){
            left_max[i] = Math.max(left_max[i-1], height[i]);
        }

        //right max
        int right_max[]= new int[height.length];
        right_max[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i>=0; i--){
            right_max[i] = Math.max(right_max[i+1], height[i]);
        }

        //loop
        int trapwater=0;
        int waterlevel[] = new int [height.length];
        for (int i = 0; i< height.length; i++){
            waterlevel[i]= Math.min(left_max[i], right_max[i]);
            trapwater += waterlevel[i]- height[i];
        }
        return trapwater;
        
    }
}