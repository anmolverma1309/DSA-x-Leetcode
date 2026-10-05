class Solution {
    public int longestWPI(int[] hours) {
        int sum = 0;
        int len = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        if(hours.length == 0) return 0;
        for(int i = 0; i < hours.length; i++){
            sum += hours[i]>8?1:-1;
            if(!hs.containsKey(sum)){
                hs.put(sum,i);
            }

            if(sum>0){
                len = i+1;
            }else if(hs.containsKey(sum-1)){
                len = Math.max(len, i-hs.get(sum-1));
            } 
        }
        return len;
    }
}