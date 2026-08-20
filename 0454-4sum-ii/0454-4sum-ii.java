class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for(int i =0; i< nums1.length; i++){
            for(int j = 0; j< nums2.length; j++){
                int sum = nums1[i] + nums2[j];
                hs.put(sum, hs.getOrDefault(sum, 0)+1);
            }      
        }
        for(int i = 0; i< nums3.length; i++){
            for(int j = 0; j< nums4.length; j++){
                int sum1 = nums3[i] + nums4[j];
                int target = -sum1;
                if(hs.containsKey(target)){
                    count += hs.get(target);
                }
            }
        }
        return count;
    }
}