class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        int arr[][] = new int [collen][rowlen];
        int row = 0;
        int col = 0;
        while(row < matrix.length) {
            arr[col][row] = matrix[row][col];
            col++;
            if(col == matrix[0].length){
                row++;
                col = 0;
            }
            
            
        }
        return arr;
        
    }
}