class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0, e = nums.length-1;
        while(s< e){
            int mid = s+(e-s)/2;
            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1]){
                    s = mid+2;
                }else{
                    e = mid;
                }
            } 
            else{
                if(nums[mid] == nums[mid-1]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }
        }return nums[s];
    }
}