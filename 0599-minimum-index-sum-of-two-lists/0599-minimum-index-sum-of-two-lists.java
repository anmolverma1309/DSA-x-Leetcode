class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hs = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i< list1.length; i++){
            hs.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        int val = 0;
        int sum = 0;
        for(int i = 0; i< list2.length; i++ ){
            
            int idx1 = 0;
            int idx2 = 0;
            if(hs.containsKey(list2[i])){
                idx1 = i;
                idx2 = hs.get(list2[i]);
                sum = idx1 + idx2;
                if(sum < min){
                    min = sum;
                    arr.clear();
                    arr.add(list2[i]);
                }
                else if(sum == min){
                    arr.add(list2[i]);
                }
            } 
        }
        String ans[] = new String [arr.size()];
        for(int i = 0; i< arr.size(); i++){
            ans[i]= arr.get(i);
        }
        
        return ans;
    }
}