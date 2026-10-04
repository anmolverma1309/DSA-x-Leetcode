class Solution {
    private int climb(int n, int stair[]){
        if(n < 0) return 0;
        if(n == 0) return 1;
        if(stair[n] != 0){
            return stair[n];
        }
        stair[n] = climb(n-1, stair)+ climb(n-2, stair);
        return stair[n]; 
    }
    public int climbStairs(int n) {
        int stair[] = new int[n+1];
        int ans = climb(n, stair);
        return ans;
    }
}