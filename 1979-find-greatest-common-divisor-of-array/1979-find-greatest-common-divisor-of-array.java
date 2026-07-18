class Solution {
    public int findGCD(int[] nums) {
        int maxele = Integer.MIN_VALUE;
        int minele = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(nums[i]> maxele){
                maxele = nums[i];
            }

            if(nums[i] < minele){
                minele = nums[i];
            }

        }
        int gdc = 0;
        for (int i = 1; i <= minele; i++){
            if(maxele%i == 0 && minele%i == 0){
                gdc = i;
            }
        }
        return gdc;

    }
}