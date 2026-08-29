class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[] = new int[nums.length];
        int sum = 0;
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            arr[i] = ((sum%k)+k)%k;
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,1);
        for(int i = 0; i< arr.length; i++){
            if(hs.containsKey(arr[i])){
                count += hs.getOrDefault(arr[i], 0);
                hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);
            }else{
                hs.put(arr[i], hs.getOrDefault(arr[i],0 )+1);
            }
        }
        return count;
    }
}