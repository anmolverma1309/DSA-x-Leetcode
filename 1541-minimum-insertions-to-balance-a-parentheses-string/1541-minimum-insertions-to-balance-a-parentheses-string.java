class Solution {
    public int minInsertions(String s) {
        int count = 0, res = 0,i = 0;
        int n = s.length();
        while(i< n){
            if(s.charAt(i) == '('){
                count++;
                i++;
            } 
            else{
                if(count>0) count--;
                else res++;

                if(i+1 <n && s.charAt(i+1) == ')') i+= 2;
                else{
                    res++;
                    i++;
                } 
            }
        }
        return res + (count*2);
    }
}