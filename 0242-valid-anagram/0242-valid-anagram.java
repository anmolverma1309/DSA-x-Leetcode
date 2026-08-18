class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            if(hs.containsKey(t.charAt(i)) && hs.get(t.charAt(i) ) >0 ){
                hs.put(t.charAt(i), hs.get(t.charAt(i))-1);
            }else{
                return false;
            }
        }return true;
    }
}