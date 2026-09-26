class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> hs = new HashMap<>();
        for(int i = 0; i < knowledge.size(); i++){
            hs.put(knowledge.get(i).get(0), knowledge.get(i).get(1));

        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i) == '('){
                int start = ++i;
                while(s.charAt(i) != ')'){
                    i++;
                }
                String val = s.substring(start,i);
                if(hs.containsKey(val)){
                    ans.append(hs.get(val));
                }else{
                    ans.append('?');
                }
            }else{
                ans.append(s.charAt(i));
            }
            i++;
        }return ans.toString();
    }
}