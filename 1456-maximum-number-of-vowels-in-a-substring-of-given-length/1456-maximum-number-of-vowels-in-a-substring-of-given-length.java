class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char curr = (s.charAt(i));
            if(isvowel(curr)){
                count++;
            }
            if(i>=k-1){
                max = Math.max(count, max);
                if(isvowel(s.charAt(i-k+1))) count--;
            }

        }
        return max;
    }
    private boolean isvowel(char s){
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
            return true;
        }
        return false;
    }
}