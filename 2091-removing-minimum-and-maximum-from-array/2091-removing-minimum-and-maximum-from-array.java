class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int minidx = -1;
        int maxidx = -1;
        int min = Integer.MAX_VALUE;
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 2){
            return 2;
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                minidx = i;
            }
            if(nums[i]>max){
                max = nums[i];
                maxidx = i;
            }
        }
        int left = Math.max(maxidx+1, minidx +1);
        int right = Math.max(nums.length-maxidx, nums.length-minidx);
        int both = Math.min(((minidx+1) + (nums.length-maxidx)), ((nums.length-minidx) + (maxidx+1)));
        return Math.min(left, Math.min(right, both));
    }
}