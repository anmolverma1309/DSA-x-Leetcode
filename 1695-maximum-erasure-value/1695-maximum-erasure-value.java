class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int j = 0;
        int sum =0 , max = 0;
        for(int i = 0; i < nums.length; i++){
            
            sum += nums[i];
            if(hs.contains(nums[i])){
                while(hs.contains(nums[i])){
                    sum-= nums[j];
                    hs.remove(nums[j]);
                    j++;
                }
            }
            hs.add(nums[i]);
            max = Math.max(max, sum);
        }return max;
    }
}