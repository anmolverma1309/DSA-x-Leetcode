class Solution {
    public boolean validPalindrome(String s) {
        int left = 0; 
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else {
                return ispalin(s, left+1,right) || ispalin(s, left, right-1);
            }
        }
        return true;
    }
    public static boolean ispalin(String s, int left, int right){
        
        while(left < right){
            char curr = s.charAt(left);
            char curr1 = s.charAt(right);
            if(curr != curr1){
                return false;
            }
            left++;
            right--;
        }return true;
    }
}