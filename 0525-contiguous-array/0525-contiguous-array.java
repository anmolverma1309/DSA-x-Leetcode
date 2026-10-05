class Solution {
    public int findMaxLength(int[] nums) {
        int prefix = 0;
        int len = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,-1);
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0) prefix--;
            else prefix++;
            if(hs.containsKey(prefix)){
                len = Math.max(len, i-hs.get(prefix));
            }else{
                hs.put(prefix, i);
            } 
        }  
        return len;
    }
}