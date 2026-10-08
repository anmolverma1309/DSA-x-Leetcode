class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int i[]: bookings){
            ans[i[0]-1] += i[2];
            if(i[1] < n) ans[i[1]] -= i[2];
        }
        for(int i = 1; i< ans.length; i++){
            ans[i] += ans[i-1];
        }
        return ans;

        // int ans[] = new int[n];
        // for(int i = 0; i<bookings.length;i++){
        //     int idx1 = bookings[i][0]-1;
        //     int idx2 = bookings[i][1];
        //     for(int j = idx1; j<idx2;j++){
        //         ans[j] += bookings[i][2];
        //     }
        // }
        // return ans;
    }
}