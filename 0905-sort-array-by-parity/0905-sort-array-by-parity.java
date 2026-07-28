class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lp = 0;
        int n = nums.length;
        int arr[] =new int [n];
        for (int i = 0; i < nums.length; i++){
            if ((nums[i] % 2) == 0){
                arr[lp] = nums[i];
                lp++;
            }
            else{
                arr[n-1] = nums[i];
                n--;
            }
        }
        return arr;
        
    }
}