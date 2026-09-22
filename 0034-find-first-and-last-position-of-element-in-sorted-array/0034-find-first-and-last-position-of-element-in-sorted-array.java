class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstidx = first(nums,target);
        int lastidx = last(nums,target);
        return new int[]{firstidx, lastidx};
    }
    private int first(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<= e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                ans = mid;
                e= mid-1;
            }else if(nums[mid] < target){
                s= mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }

    private int last(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<= e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                ans = mid;
                s= mid+1;
            }else if(nums[mid] < target){
                s= mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
}