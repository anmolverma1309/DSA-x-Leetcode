class Solution {
    public int findMaxLength(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = 0;
        int prefix = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                prefix += -1;
                arr[i] = prefix;
            }else{
                prefix += 1;
                arr[i] = prefix;
            }
        }
        int len = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,-1);
        for(int i = 0; i< nums.length; i++){
            if(hs.containsKey(arr[i])){
                int currlen = i - hs.get(arr[i]);
                if(currlen > len ){
                    len = currlen;
                }
            }else{
                hs.put(arr[i], i);
            } 
        }  
        return len;
    }
}