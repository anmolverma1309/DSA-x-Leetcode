class Solution {
    public int minSubarray(int[] nums, int p) {
       long sum = 0;
       for(int i = 0; i <nums.length; i++) sum += nums[i];

       int target =(int) (sum % p);
       if(target == 0) return 0;

       HashMap<Integer,Integer> hs = new HashMap<>();
       hs.put(0,-1);

       long newsum = 0;
       int len = nums.length;

       for(int i = 0; i < nums.length; i++){
        newsum += nums[i];
        int rem = (int)(newsum %p);

        
        if(hs.containsKey((rem-target+p)%p)){
            len = Math.min(len, i-hs.get((rem-target+p)%p));
        }
        hs.put(rem,i);
       }
       return len ==nums.length?-1:len;
    }
}