class Solution {
    public int threeSumClosest(int[] nums, int target) {   
        Arrays.sort(nums);
        int initial = nums[0] + nums[1] + nums[2];
        for(int first = 0; first<nums.length-2; first++){
            int n = nums.length-1;
            int i = 1+first;
            while(i<n){
                int sum = nums[first] + nums[i] + nums[n];
                if(Math.abs(sum-target) < Math.abs(initial-target)){
                    initial = sum;
                }
                if(sum<target){
                    i++;
                }else{
                    n--;
                }
            }
        }return initial;
    }
}