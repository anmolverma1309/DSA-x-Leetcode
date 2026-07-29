class Solution {
    public int[] findErrorNums(int[] nums) {
        int dub = -1; 
        int missing = -1;
        int n = nums.length;
        Arrays.sort(nums);
        int arr[] = new int [2];
        if(nums[0] != 1){
            missing = 1;
        }
        if(nums[n-1] != n){
            missing = n; 
        }
        for(int i = 0; i<nums.length-1; i++){
            
            if(nums[i+1] - nums[i] == 1 ){
                continue;
            }
            else if(nums[i] == nums[i+1]){
                dub = nums[i];
            }else if(nums[i+1] - nums[i] > 1 ){
                missing = nums[i] +1;

            }
        }
        arr[0] = dub;
        arr[1] = missing;
        
        
        
        return arr;
        
    }
}