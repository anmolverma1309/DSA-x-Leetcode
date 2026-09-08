class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hs = new HashMap<>();
        String arr[] = s1.split(" ");
        String arr1[] = s2.split(" ");
        ArrayList<String> list =  new ArrayList<>();
        for(String x : arr){
            hs.put(x, hs.getOrDefault(x, 0)+1);
        }
        for(String x : arr1){
            hs.put(x, hs.getOrDefault(x, 0)+1);
        }
        for(String x :  arr){
            if(hs.get(x) == 1){
                list.add(x);
            }
        }
        for(String x :  arr1){
            if(hs.get(x) == 1){
                list.add(x);
            }
        }
        return list.toArray(new String[0]);
    }
}