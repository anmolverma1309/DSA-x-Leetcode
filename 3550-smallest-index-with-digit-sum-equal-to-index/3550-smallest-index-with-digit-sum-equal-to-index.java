class Solution {
    public int smallestIndex(int[] nums) { 
        int num=0;
        for(int i = 0; i < nums.length; i++){
           int sum = 0; 
            num = nums[i];
            while(num>0){
                sum += num%10;
                num /= 10;
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}