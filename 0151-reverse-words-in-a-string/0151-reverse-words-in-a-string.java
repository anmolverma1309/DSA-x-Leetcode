class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i>= 0; i--){
            sb.append(arr[i]);
            if(i> 0){
                sb.append(" ");
            }
        }
        return sb.toString();
        // String s1 ="";
        // for(int i = arr.length-1; i> 0; i--){
        //     s1 += arr[i] + " ";
        // }
        // return s1 + arr[0];
    }
}