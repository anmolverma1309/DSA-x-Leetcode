class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum() ;
        int ans = 0;
        while(s<r){
            int mid = s+(r-s)/2;
            if(iscap(weights,mid) <= days){
                
                r = mid;
            }else{
                s = mid+1;
            }
        }return s;
    }
    private int iscap(int weights[],int mid){
        int days = 1;
        int capacity = 0;
        for(int weight: weights){
            if(capacity+weight > mid){
                days++;
                capacity = weight;
            }else {
                capacity += weight;
            }
        }
        return days;
    }
}