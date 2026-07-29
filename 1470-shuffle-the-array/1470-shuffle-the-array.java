class Solution {
    public int[] shuffle(int[] nums, int n) {
        int mid = nums.length/2;
        int arr[] = new int[nums.length];
        int k = 0;
        for(int i = 0; i< mid; i++){
            arr[k] = nums[i];
            k += 2;
        }
        int j = 1;
        for(int i = mid; i< nums.length; i++){
            arr[j] = nums[i];
            j += 2;
        }
        return arr;
    }
}