class Solution {
    public static void reverse(int nums[], int lp, int rp){
        while(lp< rp){
            int temp = nums[lp];
            nums[lp] = nums [rp];
            nums[rp] = temp;
            lp++;
            rp--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

}