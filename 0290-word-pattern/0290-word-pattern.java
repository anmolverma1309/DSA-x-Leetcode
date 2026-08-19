class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hs = new HashMap<>();
        HashMap<String, Character> hs1 = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        for(int i = 0; i< pattern.length(); i++ ){
            hs.put(pattern.charAt(i), arr[i]);
        }
        for(int i = 0; i< pattern.length(); i++ ){
            char ch = pattern.charAt(i);
            
            if(hs.containsKey(ch) || hs1.containsKey(arr[i])){
                if(hs.containsKey(ch) && !hs.get(ch).equals(arr[i]) || hs1.containsKey(arr[i]) && !hs1.get(arr[i]).equals(ch)){
                    return false;
                }
            }
            hs1.put( arr[i], pattern.charAt(i));
        }
        return true;

    }
}