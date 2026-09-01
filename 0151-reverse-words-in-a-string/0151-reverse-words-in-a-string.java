class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String s1 ="";
        for(int i = arr.length-1; i> 0; i--){
            s1 += arr[i] + " ";
        }
        return s1 + arr[0];
    }
}