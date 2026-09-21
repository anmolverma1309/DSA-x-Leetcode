class Solution {
    private int binary(int nums[], int start, int end, int target){
        if(start>end) return -1;
        int mid = start+(end-start)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid] > target){
            return binary (nums, start,mid-1, target);
        }
        return binary(nums, mid+1, end, target);
    }
    
    public int search(int[] nums, int target) {
        int ans = binary(nums, 0, nums.length-1, target);
        return ans;
    }
    
}