class Solution {
    public int strStr(String haystack, String needle) {
        int left = 0;
        int right = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.contains(needle)){
                return haystack.indexOf(needle);
            }
        }return -1;
    }
}