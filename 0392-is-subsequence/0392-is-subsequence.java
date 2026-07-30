class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean val = true;
        int j = 0;
        for (int i = 0; i< s.length(); i++){
            while(j<t.length() && s.charAt(i) != t.charAt(j)){
                j++;
            }
            if(j == t.length()){
                val = false;
                
            }
            j++;
        }
        return val;
    }
}