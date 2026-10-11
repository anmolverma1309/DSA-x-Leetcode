class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int i = 0, j =0;
        int count = 0;
        while(j< s.length()){
            hs.put(s.charAt(j), hs.getOrDefault(s.charAt(j),0)+1);
            if(j>=3){
                hs.put(s.charAt(i), hs.get(s.charAt(i))-1);
                if(hs.get(s.charAt(i)) == 0) hs.remove(s.charAt(i));
                i++;
            }
            
            if(hs.size() == 3) count++;

            j++;

        }
        return count;
    }
}