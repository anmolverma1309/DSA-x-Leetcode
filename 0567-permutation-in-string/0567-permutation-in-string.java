class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()> s2.length()){
            return false;
        }
        HashMap<Character, Integer> hs = new HashMap<>();
        int k = s1.length();
        for(int i = 0; i < s1.length(); i++){
            hs.put(s1.charAt(i), hs.getOrDefault(s1.charAt(i), 0)+1);
        }
        HashMap<Character, Integer> hs1 = new HashMap<>();
        for(int i = 0; i< s2.length(); i++){
            char curr = s2.charAt(i);
            hs1.put(curr, hs1.getOrDefault(curr,0)+1);
            if(i>=k){
                char left = s2.charAt(i-k);
                hs1.put(left, hs1.get(left)-1);
                if(hs1.get(left)==0){
                    hs1.remove(left);
                }
            }
            if(i>=k-1 && hs.equals(hs1)){
                return true;
            }
        }return false;
    }
}