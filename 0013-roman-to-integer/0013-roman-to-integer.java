class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> hs = new HashMap<>(Map.of('I',1, 'V',5, 'X', 10, 'L',50, 'C',100, 'D',500,'M',1000));

        int ans = 0;
        for(int i = 0; i<s.length();i++){
            int curr = hs.get(s.charAt(i));
            int next = (i+1<s.length()) ? hs.get(s.charAt(i+1)):0;

            if(curr>=next) ans += curr;
            else ans -= curr;
        }
        return ans;
    }
}