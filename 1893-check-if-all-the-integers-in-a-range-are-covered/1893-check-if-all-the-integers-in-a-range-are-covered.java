class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] d = new int[52];
        for (int i = 0; i < ranges.length; i++) {
            d[ranges[i][0]]++;
            d[ranges[i][1] + 1]--;
        }
        for (int i = 1; i <= 50; i++) {
            d[i] += d[i - 1];
        }
        for (int i = left; i <= right; i++) {
            if (d[i] <= 0) {
                return false;
            }
        }
        return true;
        // boolean check[] = new boolean[51];
        // for(int[] inter:ranges){
        //     int start = inter[0];
        //     int end = inter[1];
        //     for(int i = start; i<=end; i++){
        //         check[i] = true;
        //     }
        // }
        // for(int i = left; i<=right; i++){
        //     if(!check[i]) return false;
        // }
        // return true;
    }
}