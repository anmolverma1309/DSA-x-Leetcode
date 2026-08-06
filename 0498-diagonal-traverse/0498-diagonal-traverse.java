class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int cols = mat[0].length;
        int rows = mat.length;
        int ans[] = new int[cols*rows];
        int k =0;
        
        for(int d = 0; d< rows+cols-1; d++){
            ArrayList<Integer> temp = new ArrayList<>();
            int row = 0;
            int col = 0;
            if(d<cols){
                row = 0;
                col = d;
            }else{
                row = d - cols + 1;
                col = cols - 1;
            }
            while(row<rows && col >= 0){
                temp.add(mat[row][col]);
                row++;
                col--;
                
            }
            if(d%2 == 0){
                Collections.reverse(temp);
            }
            for(int num:temp){
                ans[k++] = num;
            }

            
        }
        
        return ans;
    }
}