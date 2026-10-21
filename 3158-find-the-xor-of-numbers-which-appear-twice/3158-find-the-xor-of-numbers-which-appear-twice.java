class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int freq[] = new int[51];
        int res = 0;
        for(int num:nums){
            freq[num]++;
            if(freq[num] == 2) res ^= num;
        } 
        return res;
    }
}