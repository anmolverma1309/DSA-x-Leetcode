class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            if(sb.length() > 0 && Math.abs(sb.charAt(sb.length()-1)-curr) == 32){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(curr);
            }
        }
        return sb.toString();

        // Stack<Character> st = new Stack<>();
        
        // for(char c : s.toCharArray()){
        //     if(!st.isEmpty() && Math.abs(c-st.peek()) == 32){
        //         st.pop();
        //     }else{
        //         st.push(c);
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!st.isEmpty()){
        //     sb.insert(0, st.pop());
        // }
        // return sb.toString();
    }
}