class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int[n][n];
        int startrow = 0;
        int startcol = 0;
        int endrow = mat.length-1;
        int endcol = mat[0].length-1;
        int count = 1;

        
        while(startrow <= endrow && startcol<= endcol){
            //top col
            for(int j = startcol; j<= endcol; j++){
                mat[startrow][j] = count;
                count++;
            }

            //endrow
            for(int i = startrow+1; i<= endrow; i++){
                mat[i][endcol] = count;
                count++;
            }
            
            // bottomcol
            for(int j = endcol-1; j>= startcol; j--){
                if(startrow == endrow){
                    break;
                }
                mat[endrow][j] = count;
                count++;
            }

            //upside first row
            for(int i = endrow-1; i>= startrow+1; i--){
                if(startcol == endcol){
                    break;
                }
                mat[i][startcol] = count;
                count++;
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return mat;
        
        
    }
}