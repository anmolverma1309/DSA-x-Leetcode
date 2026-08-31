class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                arr[i] += 32;
            }
        }
        return new String(arr);
        // return s.toLowerCase();
    }
}