class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int prod = (27-(s.charAt(i)-'a'+1)) *(i+1);
            sum+= prod;
        }
        return sum;
    }
}