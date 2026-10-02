class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            hs.put(curr, hs.getOrDefault(curr,0)+1);
            while(hs.size() == 3){
                count += s.length() - i;
                hs.put(s.charAt(left) , hs.get(s.charAt(left))-1);
                if(hs.get(s.charAt(left)) == 0) hs.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}