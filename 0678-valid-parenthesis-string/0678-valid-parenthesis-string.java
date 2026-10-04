class Solution {
    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for(int i = 0; i < s.length();i++){
            char curr = s.charAt(i);
            if(curr == '('){
                min++;
                max++;
            }
            else if(curr == ')'){
                min--;
                max--;
            }else{
                max++;
                min--;
            }
            if(max<0) return false;
            if(min<0) min = 0;
        }
        return min == 0;
    }
}