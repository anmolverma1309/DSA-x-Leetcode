class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int count = 0;
        int max = Integer.MIN_VALUE;
        if(s == null || s.length()==0){
            return 0;
        }
        for(int i = 0; i < s.length(); i++){
            if(hs.containsKey(s.charAt(i))){
                count = Math.max(count, hs.get(s.charAt(i))+1);
            }
            hs.put(s.charAt(i), i);
            max = Math.max(max, i-count+1);
        }
        return max;
        
    }
}