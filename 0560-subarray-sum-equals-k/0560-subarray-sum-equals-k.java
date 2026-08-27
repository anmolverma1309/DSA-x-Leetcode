class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        int sum = 0;
        hs.put(sum, 1);
        int require = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            require = sum -k;
            if(hs.containsKey(require)){
                count += hs.get(require);
            }
            hs.put(sum, hs.getOrDefault(sum,0)+1 );
        }
        return count;
    }
}