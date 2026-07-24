class Solution {
    public int removeDuplicates(int[] nums) {
        int uni = 0;
        
        
        for (int dub = 1; dub< nums.length; dub++){
            if(nums[uni] != nums[dub]){
                uni++;
                nums[uni] = nums[dub];
               
            }
            
        }return uni+1;
        
    }
}