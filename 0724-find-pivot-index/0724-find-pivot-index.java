class Solution {
    public int pivotIndex(int[] nums) {
    
        int leftsum = 0;
        int curr = 0;
        int rightsum = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            curr = nums[i];
            rightsum = total - leftsum - curr;
            if(leftsum == rightsum){
                return i;
            }
            leftsum += curr;
            
        }
        
        return -1;        
    }
}