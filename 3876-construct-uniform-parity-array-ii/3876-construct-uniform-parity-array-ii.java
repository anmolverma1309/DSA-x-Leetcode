class Solution {
    
    private boolean check(int parity, int[] nums1, int minodd){
        for(int i = 0 ; i< nums1.length; i++){
            if((nums1[i] & 1) != parity && nums1[i] <= minodd ){
                return false;
            }
        }
        return true;
    }
    public boolean uniformArray(int[] nums1) {
        int minodd = Integer.MAX_VALUE;
        for(int i = 0; i< nums1.length; i++){
            if(nums1[i]%2 != 0 && nums1[i] < minodd){
                minodd = nums1[i];
            }
        }
        boolean even = check(0, nums1, minodd);
        boolean odd = check(1,nums1, minodd);
        
        return even|| odd;
    }
}