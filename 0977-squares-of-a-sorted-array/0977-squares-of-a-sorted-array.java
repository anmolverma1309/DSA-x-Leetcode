class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int arr[] = new int [nums.length];
        int lp = 0;
        int rp = nums.length-1;
        int i = nums.length-1;
        while(lp <= rp){
            int sq1 = nums[lp] * nums[lp];
            int sq2 = nums[rp] * nums[rp];
            if(sq2 > sq1){
                arr[i] = sq2;
                rp--;
            }
            else{
                arr[i] = sq1;
                lp++;
            }
            i--;
        }
        return arr;
        
        // for (int i =0; i< nums.length; i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        
    }
}