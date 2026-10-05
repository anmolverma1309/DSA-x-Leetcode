class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[] = new int[nums.length];
        int sum = 0;
        int count = 0;
        int req = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,1);
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            req = ((sum%k)+k)%k;
            count += hs.getOrDefault(req, 0);
            hs.put(req, hs.getOrDefault(req,0)+1);
        }
        return count;
    }
}