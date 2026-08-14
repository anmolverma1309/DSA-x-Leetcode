class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        
        for(int i = 0; i < intervals.length; i++){
            count += 1;
        }
        for(int i = 1; i < intervals.length; i++){
            int last[] = ans.get(ans.size()-1);
            if(intervals[i][0] < last[1]){
                continue;
            }else{
                ans.add(intervals[i]);
            }
        }
        return count-ans.size();

        
    }
}