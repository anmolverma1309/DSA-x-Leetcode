class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        
        for(int i =0; i< s.length(); i++){
            int[] freq = new int[26];
            for(int j =i; j<s.length(); j++){
           
                char curr = s.charAt(j);
                freq[curr-'a']++;
                if(freq[curr-'a'] > 2){
                    
                    break;
                }
                max = Math.max(max, j - i + 1);
            }

        }
        return max;
    }
}