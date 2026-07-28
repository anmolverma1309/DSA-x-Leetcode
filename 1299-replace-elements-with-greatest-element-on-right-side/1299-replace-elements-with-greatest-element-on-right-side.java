class Solution {
    public int[] replaceElements(int[] arr) {
        int rightmax[] = new int[arr.length];
        int n = arr.length-1;
        rightmax[n] = -1;
        for (int i = arr.length-2; i >= 0 ; i--){
            rightmax[i] = Math.max(arr[i+1], rightmax[i+1]);
        }
        return rightmax;
        
    }
}