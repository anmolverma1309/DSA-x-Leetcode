class Solution {
    int m,n;
    int dir[][] = {{0,1}, {0,-1}, {1,0},{-1,0}};

    private long dfs(int [][] grid, int i, int j){
        long sum =  grid[i][j];
        grid[i][j] = 0;
        for(int d[]: dir){
            int ni = i+d[0];
            int nj = j+d[1];
            if(ni>=0 && ni<m && nj>=0 && nj <n && grid[ni][nj] >0){
                sum += dfs(grid, ni,nj);
            }
        }return sum;
    }
    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        int count = 0;
        for(int i= 0;i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] > 0 ){
                    long sum = dfs(grid, i, j);
                    if(sum %k == 0) count++;
                }
            }
        }
        return count;
    }
}