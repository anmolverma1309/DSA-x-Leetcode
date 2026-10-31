class Solution {
    int up = 1;
    int left = 0;
    int m, n;
    int mod = 1000000007;

    public int solve(int[][]grid, int i, int j, int came, int[][][] dp){
        if(i == m-1 && j ==n-1) return 1;
        if(i>=m || j>= n) return 0;
        if(dp[i][j][came] != -1) return dp[i][j][came];

        if(grid[i][j] == 1){
            if(came == left) return dp[i][j][came] = solve(grid, i+1, j, up,dp);
            else return dp[i][j][came] = solve(grid, i, j+1, left,dp);
        }
        int total = 0;
        total = (total+solve(grid, i,j+1, left,dp)) %mod;
        total = (total+solve(grid, i+1, j, up,dp)) %mod;

        return dp[i][j][came] = total;
    }
    public int uniquePaths(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int[][][] dp = new int[m + 1][n+1][2];
        for (int[][] row : dp) {
            for (int[] cell : row) {
                Arrays.fill(cell, -1);
            }
        }
        return solve(grid,0,0,left, dp);
    }
}