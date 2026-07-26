class Solution {
    public int maximumProduct(int[] nums) {
        int fir = 0;
        int sec = 1; 
        int thi = nums.length-1;
        int fou = nums.length-2;
        int fiv = nums.length-3;
        int max = 0;
        Arrays.sort(nums);
        int mul = nums[fir] * nums[sec] * nums[thi];
        int mul2 = nums[thi] * nums[fou] * nums[fiv];
        max =  Math.max(mul, mul2);
        return max;
        
    }
}