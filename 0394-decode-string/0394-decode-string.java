class Solution {
    public String decodeString(String s) {
        Stack <Character> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }

            arr.add(num);
            i--; 
            }
            if(s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            if (Character.isLetter(s.charAt(i))) {
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == ']'){
                while(st.peek() != '['){
                    sb.insert(0,st.pop());
                }
                st.pop();
                String decoded = sb.toString().repeat(arr.remove(arr.size()-1));
                for (char c : decoded.toCharArray()) {
                    st.push(c);
                }
            }

        }
        while (!st.isEmpty()) {
            res.insert(0, st.pop());
        }
        return res.toString();
    }
}