class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int r= Arrays.stream(piles).max().getAsInt();
        int ans = r;
        while(s<= r){
            int mid = s+(r-s)/2;
            if(isfin(piles,h,mid)){
                ans = mid;
                r = mid-1;
            }else{
                s = mid+1;
            }
        }return ans;
    }
    private boolean isfin(int piles[], int h, int mid){
        long hours = 0;
        for(int pile:piles){
            hours += pile/mid;
            if(pile%mid != 0) hours++;
        }
        return hours <= h;
    }
}