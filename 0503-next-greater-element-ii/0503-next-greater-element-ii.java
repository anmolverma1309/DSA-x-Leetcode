class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i] = -1;
        int k = 0;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            for(int j = i+1; j<n+i; j++){
                if(nums[j%n] > num){
                    arr[k] = nums[j%n];
                    break;
                }
            }
            k++;
        }
        return arr;
    }
}