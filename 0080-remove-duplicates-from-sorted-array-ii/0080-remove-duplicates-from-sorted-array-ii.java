class Solution {
    
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int count = 1;
        for(int i = 0; i<k-1; i++){
            int fast = i+1;
            if(nums[i] == nums[fast]){
                count++;
                if(count >= 3){
                    swap(nums, fast, k-1);
                    k--;
                    count--;
                    i--;
                }
            }else{
                count = 1;
            }
        }
        return k;
    }
    public static void swap(int nums[], int left, int right){
        while(left<right){
            nums[left]= nums[left+1];
            left++;
        }
    }
}