class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            char curr = s.charAt(i);

            if(!st.isEmpty() && st.peek() == curr){
                st.pop();
            }else{
                st.push(curr);
            }  
        }
        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
        }
        String rev = "";
        for(int i = ans.length()-1; i>= 0; i--){
            rev += ans.charAt(i);
        }
        return rev;
    }
}