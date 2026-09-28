class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        int e = Integer.MIN_VALUE;
        for(int x: nums){ 
            if(x>e){
                e = x;
            }
        }
        while(s< e){
            int mid = s+(e-s)/2;
            if(div(nums,mid,threshold)){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }
    private boolean div(int[]nums, int mid, int threshold){
        int sum = 0;
        for(int x: nums){
            sum += ((x + mid -1) / mid);

        }
        return sum <= threshold;
    }
}