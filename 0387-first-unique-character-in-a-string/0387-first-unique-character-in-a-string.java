class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int [26];
        for(int c = 0; c< s.length(); c++){
            char curr = s.charAt(c);
            freq[curr - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(freq[curr - 'a'] == 1) return i;
        }
        return -1;
    }
}