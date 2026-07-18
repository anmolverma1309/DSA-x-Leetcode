class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int zerocount = 0;
        int arr[] = new int[n];
        for (int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zerocount++;
            }else{
                prod *= nums[i];
            }        
        }
        for (int i = 0; i<nums.length; i++){
            if(zerocount > 1){
                arr[i] = 0;
            }else if(zerocount == 1){
                if(nums[i] == 0){
                    arr[i] = prod;
                }else{
                    arr[i] = 0;
                }
                
            }else{
                arr[i] = prod/nums[i];
            }
            
             
        }

        
        return arr;
        
    }
}