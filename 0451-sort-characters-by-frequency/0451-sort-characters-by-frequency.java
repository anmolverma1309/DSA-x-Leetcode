class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        }
        
        char val = 0;
        int count = 0;
        while( count < s.length()){
            int freq =-1;
            for(Map.Entry<Character, Integer> entry : hs.entrySet()){
                if(entry.getValue() > freq){
                    freq = entry.getValue();
                    val = entry.getKey();
                    
                }
                
            }
            count += freq;
            for(int i = 0; i< freq; i++){
                ans.append(val);
            }
            hs.remove(val);
        }
        return ans.toString();
        
    }
}