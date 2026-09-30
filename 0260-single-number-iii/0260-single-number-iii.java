class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int x : nums){
            xor ^= x;
        }
        int first = 0;
        int last = 0;
        long mask = xor & -xor;
        for(int num:nums){
            if((mask & num) != 0) {
                first ^= num;
            }else{
                last ^= num;
            }
        }
        int arr[] = {first, last};
        return arr;
    }
}