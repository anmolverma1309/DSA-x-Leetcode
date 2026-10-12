class Solution {
    int mod = 1_000_000_007;
    public int maxSum(List<Integer> nums, int k) {
        int arr[] = new int[32];
        for(int num: nums){
            for(int b = 0; b< 32; b++){
                if((num & (1<<b)) != 0){
                    arr[b]++;
                }
            }
        }

        long res = 0;
        while(k-- > 0){
            long curr = 0;
            for(int b = 0; b< 32; b++){
                if(arr[b] > 0){
                    arr[b]--;

                    curr = (curr | (1<<b));
                }
            }
            res = (res+ (curr * curr)) % mod;
        }
        return (int)res;
    }
}