class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums,k) - solve(nums,k-1);
    }
    public int solve(int nums[], int k){
        int i = 0, j =0;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        while(j< nums.length){
            hs.put(nums[j], hs.getOrDefault(nums[j],0)+1);
            while(hs.size() > k){
                hs.put(nums[i], hs.get(nums[i])-1);
                if(hs.get(nums[i]) == 0) hs.remove(nums[i]);
                i++;
            }
            count += j-i+1;
            j++;
        }
        return count;
    }
}