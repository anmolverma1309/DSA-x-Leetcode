class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        boolean val = true;
        for(int i = 0; i< strs[0].length(); i++){
            char curr = strs[0].charAt(i);
            for(int j = 1; j< strs.length; j++){
                if(i >= strs[j].length()){
                    return sb.toString();
                }
                char curr1 = strs[j].charAt(i);
                if(curr != curr1){
                    return sb.toString();
                }
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}