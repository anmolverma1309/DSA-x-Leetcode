class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hs = new HashMap<>();
        HashMap<Character, Character> hs1 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            hs.put(s.charAt(i), t.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            hs1.put(t.charAt(i), s.charAt(i));
        }
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            if(hs.containsKey(ch) && hs1.containsKey(ch1)){
                if(hs.get(ch) != t.charAt(i) || hs1.get(ch1) != s.charAt(i)){
                    return false;
                }
            }
            
        }

        // for(int i = 0; i< t.length(); i++){
        //     char ch = s.charAt(i);
        //     if(hs.get(ch) != t.charAt(i)){
        //         return false;
        //     }
        //     hs1.put(t.charAt(i), s.charAt(i));
        // }
        return true;
    }
}