class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int max = 0;
        Arrays.sort(nums);
        int mul = nums[0] * nums[1] * nums[n-1];
        int mul2 = nums[n-1] * nums[n-2] * nums[n-3];
        max =  Math.max(mul, mul2);
        return max;
        
    }
}