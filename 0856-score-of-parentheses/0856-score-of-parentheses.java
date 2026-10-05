class Solution {
    public int scoreOfParentheses(String s) {

        int depth = 0,score = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') depth++;
            else{
                --depth;
                if(s.charAt(i-1) == '('){
                    score += (int)Math.pow(2, depth);
                }
            }  
        }
        return score;

        // int score = 0;
        // Stack <Integer> st = new Stack<>();
        // for(int i = 0; i < s.length();i++){
        //     if(s.charAt(i) == '('){
        //         st.push(score);
        //         score = 0;
        //     }else{
        //         if(s.charAt(i-1) == '('){
        //             score = st.peek()+1;
        //         }else{
        //             score = st.peek() + (2*score);
        //         }
                
        //     }
        // }return score;
    }
}