class Solution {
    public void rotate(int[][] matrix) {
        // transpose 
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int lp = 0;
        int rp = matrix.length-1;
        int row = 0;
        while(lp < rp && row< matrix.length){
            int temp = matrix[row][lp];
            matrix[row][lp] = matrix[row][rp];
            matrix[row][rp] = temp;
            lp++;
            rp--;
            if(lp == rp || lp> rp){
                row++;
                lp = 0;
                rp = matrix.length-1;
            }
        }
        
    }
}