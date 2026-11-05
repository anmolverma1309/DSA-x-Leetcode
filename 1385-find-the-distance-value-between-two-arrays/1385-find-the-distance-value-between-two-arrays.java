class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i = 0; i<arr1.length; i++){
            boolean val = true;
            int curr = arr1[i];
            for(int j = 0; j<arr2.length; j++){
                if(Math.abs(arr2[j]-curr) <= d){
                    val = false;
                    break;
                }
                
            }
            if(val) count++;
        }return count;
    }
}