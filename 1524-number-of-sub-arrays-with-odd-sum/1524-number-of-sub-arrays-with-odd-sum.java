class Solution {
    public int numOfSubarrays(int[] arr) {
        int sum = 0, mod = 1000000007;
        int even =1, odd = 0;
        long ans = 0;
        for(int x: arr){
            sum = (sum+x)%2;
            if(sum ==1){
                ans = (ans+even)%mod;
                odd++;
            }else{
                ans = (ans+odd)%mod;
                even++;
            }
        }return (int) ans;
    }
}