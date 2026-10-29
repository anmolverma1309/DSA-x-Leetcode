class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean check[] = new boolean[51];
        for(int[] inter:ranges){
            int start = inter[0];
            int end = inter[1];
            for(int i = start; i<=end; i++){
                check[i] = true;
            }
        }
        for(int i = left; i<=right; i++){
            if(!check[i]) return false;
        }
        return true;
    }
}