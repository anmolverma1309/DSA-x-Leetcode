class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> a[1]-b[1]);
        int arrow = points[0][1];
        int count = 1;
        for(int i = 1; i < points.length; i++){
            if( arrow >= points[i][0] && arrow <= points[i][1]){
                continue;
            }else{
                arrow = points[i][1];
                count++;
            }
        }
        return count;
    }
}