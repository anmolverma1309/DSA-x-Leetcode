class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        helper(image,sr, sc, color, image[sr][sc]);
        return image;
    }
    private void helper(int[][] image, int sr, int sc, int color, int orgcolor){
        if(sr<0 || sr>image.length-1 || sc<0 || sc> image[0].length-1 || image[sr][sc] != orgcolor){
            return;
        }
        image[sr][sc] = color;

        helper(image, sr+1,sc,color, orgcolor);
        helper(image, sr-1,sc,color, orgcolor);
        helper(image, sr,sc+1,color, orgcolor);
        helper(image, sr,sc-1,color, orgcolor);

    }
}