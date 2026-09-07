class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '[' ){
                st.push(curr);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.peek();
                if((curr == ')' &&  ch == '(') || (curr == '}' &&ch == '{') || (curr ==']' && ch =='[')){
                    st.pop();
                }
                else if(curr !=  st.peek()){
                    return false;
                }
            }
        }return st.isEmpty();
    }
}