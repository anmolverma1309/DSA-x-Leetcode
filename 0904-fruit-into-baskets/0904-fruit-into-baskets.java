class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int j = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0; i < fruits.length; i++){
            hs.put(fruits[i], hs.getOrDefault(fruits[i],0)+1);
            if(hs.size() >= 3){
                hs.put(fruits[j],hs.get(fruits[j])-1);
                if(hs.get(fruits[j])==0) hs.remove(fruits[j]);
                j++;
            }
            max = Math.max(max, i-j+1);
            
        }
        return max;
    }
}