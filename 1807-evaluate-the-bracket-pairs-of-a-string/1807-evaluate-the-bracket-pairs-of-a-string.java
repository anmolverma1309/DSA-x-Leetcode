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
                i++;
                StringBuilder sb = new StringBuilder();
                while(s.charAt(i) != ')'){
                    sb.append(s.charAt(i));
                    i++;
                }
                if(hs.containsKey(sb.toString())){
                    ans.append(hs.get(sb.toString()));
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