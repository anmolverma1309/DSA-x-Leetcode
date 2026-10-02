class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<>();
       gen(n,0,0,ans,"");
       return ans; 
    }
    private void  gen(int n, int open, int close, List<String> ans, String s){
        if(n == open && n == close){
            ans.add(s);
            return;
        }
        if(n < open || n < close){
            return;
        }
        if(close < open){
            gen(n, open +1, close, ans, s+"(");
            gen(n,open, close+1, ans, s+")");
        }else{
            gen(n, open+1, close, ans, s+"(");
        }
        return;
    }
}