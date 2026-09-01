class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i = 0; i< magazine.length(); i++){
            char curr = magazine.charAt(i);
            hs.put(curr, hs.getOrDefault(curr,0)+1);
        }
        for(int i = 0; i<ransomNote.length(); i++){
            char curr = ransomNote.charAt(i);
            if(hs.containsKey(curr)){
                if(hs.get(curr) == 1){
                    hs.remove(curr);
                }else{
                    hs.put(curr, hs.getOrDefault(curr,0)-1);
                }
               
            }else{
                return false;
            }
        }
        return true;
    }
}