class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int tot = rows * cols;
        k %= tot;

        int arr[][] = new int [rows][cols];
        for(int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                int oldIndex = i * cols + j;
                int newIndex = (oldIndex + k) % tot;
                int newRow = newIndex / cols;
                int newCol = newIndex % cols;
                arr[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> curr = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j<cols; j++){
                row.add(arr[i][j]);
            }
            curr.add(row);
        }
        
        
        return curr;
        
    }
}