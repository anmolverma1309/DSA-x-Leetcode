class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = 0,max=0;
        int count = 1;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 1; i< nums.length; i++){
            
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count > max){
                max=count;
                num=nums[i];
            }

        }
        return num ;
        
    }
}