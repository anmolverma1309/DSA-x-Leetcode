class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0,right = 0, ans = 0, maxfreq = 0;
        HashMap<Character,Integer> hs = new HashMap<>();
        while(right<answerKey.length()){
            char curr = answerKey.charAt(right);
            hs.put(curr, hs.getOrDefault(curr,0)+1);

            maxfreq = Math.max(maxfreq, hs.get(curr));

            while((right-left+1) - maxfreq > k){
                char curr1 = answerKey.charAt(left);
                hs.put(curr1, hs.get(curr1)-1);
                left++;
            }

            ans = Math.max(ans, right-left+1);
            right++;
        }return ans;
    }
}