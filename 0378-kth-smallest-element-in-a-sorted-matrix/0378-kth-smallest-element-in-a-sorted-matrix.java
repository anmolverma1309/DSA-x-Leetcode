class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int s = matrix[0][0];
        int n = matrix[matrix.length-1][matrix.length-1];
        int e = n;
        while(s<e){
            int mid = s+(e-s)/2;
            if(count(matrix, mid, k)){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }return s;
    }
    private boolean count(int [][]matrix,int mid, int k){
        int n = matrix.length;
        int row = n-1;
        int col = 0;
        int count = 0;
        while(row >= 0 && col< n){
            if(matrix[row][col] <= mid){
                count += row+1;
                col++;
            }
            else {
                row--;
            }
        }return count < k;
    }
}