class Solution {
    public String mergeAlternately(String word1, String word2) {
        int idx2 = word2.length();
        int idx1 = word1.length();
        int smallest = Integer.MAX_VALUE;
        if(idx1 < idx2){
            smallest = idx1;
        }else{
            smallest = idx2;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<smallest; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        while(smallest< word1.length()){
            sb.append(word1.charAt(smallest));
            smallest++;
        }
        while(smallest< word2.length()){
            sb.append(word2.charAt(smallest));
            smallest++;
        }
        return sb.toString();
    }
}