class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        st.push(num.charAt(0));
        for(int i = 1; i< num.length(); i++){
            while(!st.isEmpty() &&  k>0 && num.charAt(i) < st.peek()){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k >0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        int count = 0;
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        int i = 0;
        while(i<sb.length() && sb.charAt(i) == '0') i++;
        
        String res = sb.substring(i);
        return res.isEmpty()?"0":res;
    }
}