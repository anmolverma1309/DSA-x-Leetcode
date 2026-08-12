class Solution {
    public int[][] merge(int[][] intervals) {
        int row = intervals.length;
        int col = intervals[0].length;
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        ans.add(intervals[0]);
        for(int i = 1; i < row; i++){
            int last[] = ans.get(ans.size()-1); 
            if(intervals[i][0] <= last[1]){
                last[1]= Math.max(last[1], intervals[i][1]);

            }else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int [ans.size()][]);
    }
}