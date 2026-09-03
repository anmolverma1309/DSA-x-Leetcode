class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> hs = new HashMap<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        int window = p.length();
        int k = 0;
        if (p.length() > s.length())
            return list;
        for(int i = 0; i < p.length(); i++){
            hs.put(p.charAt(i), hs.getOrDefault(p.charAt(i), 0)+1);
        }
        HashMap<Character, Integer> curr = new HashMap<>();
        for(int i = 0; i< p.length(); i++ ){
            curr.put(s.charAt(i), curr.getOrDefault(s.charAt(i),0)+1);
        }
        if(curr.equals(hs)){
            list.add(0);
        }
        for(int i = 1; i<= s.length()-p.length(); i++){
            if(curr.get(s.charAt(i-1)) == 1){
                curr.remove(s.charAt(i-1));
            }else{
                curr.put(s.charAt(i-1), curr.getOrDefault(s.charAt(i-1),0)-1);
            }
            
            curr.put(s.charAt(i+window-1), curr.getOrDefault(s.charAt(i+window-1),0)+1);
            if(curr.equals(hs)){
                list.add(i);
            }
        }
        return list;
    }
}