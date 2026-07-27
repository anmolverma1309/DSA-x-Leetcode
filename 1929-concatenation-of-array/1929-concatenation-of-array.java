class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2*nums.length;
        int arr[] = new int [n];
        for (int i =0; i< arr.length; i++){
            arr[i] = nums[i%nums.length];

        }
        return arr;
        
    }
}