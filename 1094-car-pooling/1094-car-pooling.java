class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int loc[] = new int[1001];
        for(int[]trip: trips){
            loc[trip[1]] += trip[0];
            loc[trip[2]] -= trip[0];
        }
        int load = 0;
        for(int cap:loc){
            load+= cap;
            if(load> capacity) return false;
        }
        return true;
    }
}