class Solution {
    public int mySqrt(int x) {
        int num = x/2;
        int s = 1, e= x/2;
        if(x == 0|| x==1){
            return x;
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid == x/mid){
                return mid;
            }else if(mid < x/mid){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }return e;
    }
}