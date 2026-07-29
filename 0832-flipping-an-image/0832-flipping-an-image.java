class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int arr[][] = new int [image.length][image[0].length];
        //reverse
        int lp = 0;
        int rp = image.length-1;
        int row = 0;

        while(lp < rp && row < image.length){
            int temp = image[row][lp];
            image[row][lp] = image[row] [rp];
            image[row] [rp] = temp;
            lp++;
            rp--;
            if(lp == rp || lp>rp){
                row++;
                lp = 0;
                rp = image.length-1;
            }
        }

        //invert
      
        for(int i = 0; i< image.length; i++){
            for(int k = 0; k < image.length; k++){
                if(image[i][k] == 0){
                    image[i][k] = 1;
                }else{
                    image[i][k] = 0;
                }
                
            }
        }
        return image;
        
    }
}