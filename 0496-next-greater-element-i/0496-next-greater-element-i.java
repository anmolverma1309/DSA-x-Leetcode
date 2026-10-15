class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i =0; i< nums2.length; i++){
            hs.put(nums2[i], i);
        }
        // for(int i = 0; i<ans.length; i++) ans[i] = -1;
        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            int idx = hs.get(num);
            if(idx == nums2.length-1){
                ans[i] = -1;
                continue;
            } 
            for(int j = idx+1; j<nums2.length;j++){
                if(nums2[j] > num){
                    ans[i] = nums2[j];
                    break;
                }else{
                    ans[i] = -1;
                }
            }
        }
        return ans;
    }
}