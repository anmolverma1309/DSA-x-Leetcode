class Solution {
    public String removeStars(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i< s.length(); i++){
            if(s.charAt(i) != '*'){
                s1.append(s.charAt(i));
            }else{
                s1.deleteCharAt(s1.length()-1);
            }
        }return s1.toString();
        
    }
}