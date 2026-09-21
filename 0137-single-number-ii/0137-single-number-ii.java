class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(int x: hs.keySet()){
            if(hs.get(x)==1){
                return x;
            }
        }
        return 1;
    }
}