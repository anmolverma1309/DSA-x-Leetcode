class Solution {
    public int findMin(int[] nums) {
        int s= 0, e= nums.length-1;
        int last = nums[nums.length-1];
        while(s<e && nums[s] == last){
            s++;
        }
        while(s<e){
            int mid = s+(e-s)/2;
            if(nums[mid]> last){
                s = mid+1;
            }else{
                e = mid;
            }
        }return nums[s];
    }
}