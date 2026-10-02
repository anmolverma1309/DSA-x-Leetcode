class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image,sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    private void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgcolor){
        if(sr<0 || sr>image.length-1 || sc<0 || sc> image[0].length-1 || vis[sr][sc] || image[sr][sc] != orgcolor){
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;

        helper(image, sr+1,sc,color, vis, orgcolor);
        helper(image, sr-1,sc,color, vis, orgcolor);
        helper(image, sr,sc+1,color, vis, orgcolor);
        helper(image, sr,sc-1,color, vis, orgcolor);

    }
}