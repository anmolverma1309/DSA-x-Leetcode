class Solution {
    private int path(int m, int n, int dp[][]){
        for(int x = m-1; x>=0; x--){
            for(int y = n-1; y>=0; y--){
                if(x == m-1 && y == n-1){
                    dp[x][y] = 1;
                    continue;
                }
                int way1 = 0, way2 = 0;
                if(x+1<m) way1 = dp[x+1][y];
                if(y+1<n) way2 = dp[x][y+1];
                dp[x][y] = way1 +way2;
            }
        }return dp[0][0];
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return path(m,n,dp);
    }
}