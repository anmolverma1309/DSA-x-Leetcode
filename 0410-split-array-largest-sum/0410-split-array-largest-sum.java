class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;
        for(int x : nums){
            if(x > s){
                s = x;
            }
            e += x;
        }
        while(s<e){
            int mid = s+(e-s)/2;
            if(split(nums,mid,k)){
                e = mid;
            }else{
                s = mid+1;
            }
        }return s;
    }
    private boolean split (int nums[], int mid, int k){
        int count = 1;
        int currsum = 0;
        for(int x:nums){
            if(currsum + x > mid){
                count++;
                currsum = x;
            }else{
                currsum += x;
            }
            if(count > k)return false;
        }return true;
    }
}