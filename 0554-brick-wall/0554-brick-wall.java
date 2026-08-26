class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < wall.size(); i++){
            int sum = 0;
            for(int j = 0; j< wall.get(i).size()-1; j++){
                sum += wall.get(i).get(j);
                hs.put(sum, hs.getOrDefault(sum,0)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int x : hs.keySet()){
            max = Math.max(max, hs.get(x));
        }
        if(hs.isEmpty()){
            return wall.size();
        }
        int num = wall.size()- max;
        return num;
    }
}