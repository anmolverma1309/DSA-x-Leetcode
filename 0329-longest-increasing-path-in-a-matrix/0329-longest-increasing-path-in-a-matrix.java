class Solution {
    int directions[][] = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    private boolean isvalid(int ni, int nj, int matrix[][]){
        return ni>= 0 && nj>=0 && ni<matrix.length && nj< matrix[0].length;
    }

    private int solve(int i, int j, int matrix[][], int dp[][]){
        if(dp[i][j] != -1) return dp[i][j];

        int ans = 0;
        for(int d[]:directions){
            int ni = i+d[0];
            int nj = j+d[1];

            if(isvalid(ni, nj, matrix) && matrix[i][j] < matrix[ni][nj]){
                ans = Math.max(ans, solve(ni,nj, matrix, dp));
            }
        }
        dp[i][j] = ans+1;
        return dp[i][j];
    }

    public int longestIncreasingPath(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;

        int dp[][] = new int [r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                dp[i][j] = -1;
            }
        }

        int max = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                max = Math.max(max, solve(i,j,matrix, dp));
            }
        }
        return max;

    }
}