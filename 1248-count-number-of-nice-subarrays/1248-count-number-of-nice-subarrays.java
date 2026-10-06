class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum =0;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 1){
                sum += 1;
            }
            hs.put(sum, hs.getOrDefault(sum,0)+1);
            if(hs.containsKey(sum-k)){
                count += hs.get(sum-k);
            }
        }
        return count;
    }
}