class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefix = 0;
        int sum = 0;
        int arr[] = new int[nums.length];
        if(nums.length< 2){
            return false;
        }
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            arr[i] = sum%k;
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,-1);
        for(int i =0; i<nums.length; i++){
            if(hs.containsKey(arr[i])){
                int newidx = i - hs.get(arr[i]);
                if(newidx >= 2){
                    return true;
                }
            }else{
                hs.put(arr[i], i);
            }
            
        }
        return false;
        
    }
}