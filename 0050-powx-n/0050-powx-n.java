class Solution {
    public double myPow(double x, int n) {
        long n1 = n;
         if (n1 < 0) {
            x = 1 / x;
            n1 = -n1;
        }
        double ans = 1;
        while ( n1 > 0){
            if((n1 & 1) != 0){
                ans = ans*x;
            }
            x = x*x;
            n1 = n1>>1;
        }
        return ans;
        
    }
}