class Solution {
    public int missingNumber(int[] nums) {
        // int xor = nums.length;
        // for(int i = 0; i< nums.length; i++) xor ^= nums[i] ^ i;
        int xor = 0;
        for(int i = 0; i<= nums.length; i++) xor ^= i;
        for(int i = 0; i< nums.length; i++) xor ^= nums[i];
        return xor;
    }
}