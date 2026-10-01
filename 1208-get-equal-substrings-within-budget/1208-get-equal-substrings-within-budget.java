class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans[] = new int [s.length()];
        for(int i = 0; i < s.length(); i++){
            ans[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int j = 0;
        int sum = 0;
        int max = 0;
        for(int i = 0; i < ans.length; i++){
            sum += ans[i];
            while(sum > maxCost){
                sum -= ans[j];
                j++;
            }
            max = Math.max(max, i-j+1);
        }return max;
    }
}