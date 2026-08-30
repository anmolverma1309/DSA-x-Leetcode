class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int arr[] = new int[nums.length];
        int sum = 0;
        int count = 0;
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,1);
        for(int i = 0; i< nums.length; i++){
            int req = arr[i]-goal;
            if(hs.containsKey(req)){
                count += hs.getOrDefault(req, 0);
                hs.put(arr[i], hs.getOrDefault(arr[i], 0)+1);
            }else{
                hs.put(arr[i],hs.getOrDefault(arr[i], 0)+1);
            }
        }
        return count;

    }
} 