class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<>();
       gen(n,n,ans,"");
       return ans; 
    }
    private void  gen(int open, int close, List<String> ans, String s){
        if(open == 0 && close == 0){
            ans.add(s);
            return;
        }
        if(open>0) gen(open-1, close, ans, s+"(");
        if(close>open) gen(open, close-1,ans, s+")");
        
       
    }
}