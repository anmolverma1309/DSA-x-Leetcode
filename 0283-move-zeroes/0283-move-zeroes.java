class Solution {
    public void moveZeroes(int[] nums) {
        int curr = 0;
        for (int next = 0; next< nums.length; next++){
            if(nums[next] != 0  ){
                int temp = nums[curr];
                nums[curr] = nums[next];
                nums[next] = temp;
                curr++;
            }

        }
        
    }
}