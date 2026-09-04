class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int arr[] = new int [nums.length];
        for(int i = nums.length-1; i>= 0; i--){
            if(nums[i] < min){
                min = nums[i];
            }
            arr[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            max = Math.max(max, nums[i]);
            int idx = max -arr[i];
            if(idx <= k){
                return i;
            }
        }
        return -1;
    }
}