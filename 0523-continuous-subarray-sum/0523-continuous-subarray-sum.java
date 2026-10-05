class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefix = 0;
        int sum = 0;
        int arr[] = new int[nums.length];
        if(nums.length< 2){
            return false;
        }
        int req = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,-1);
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            req = sum % k;
            if(hs.containsKey(req)){
                int newidx = i - hs.get(req);
                if(newidx >= 2){
                    return true;
                }
            }else{
                hs.put(req, i);
            }
        }
        return false;
        
    }
}