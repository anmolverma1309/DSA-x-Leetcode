class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;
        int maxfreq = 0;
        HashMap<Character, Integer> hs = new HashMap<>();
        while(right<s.length()){
            char ch = s.charAt(right);
            hs.put(ch, hs.getOrDefault(ch, 0)+1);

            maxfreq = Math.max(maxfreq, hs.get(ch));

            while((right-left+1)-maxfreq > k){
                char curr = s.charAt(left);
                hs.put(curr, hs.get(curr)-1);
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }return ans;
    }
}