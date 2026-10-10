class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums1.length;i++){
            int diff = Math.abs(nums1[i]-nums2[i]);
            if(diff>max) max = diff;
        }

        int count[] = new int[max+1];
        int k = k1+k2;

        for(int i =0; i< nums1.length;i++){
            int dif = Math.abs(nums1[i]-nums2[i]);
            count[dif]++;
        }

        for(int i = count.length-1; i> 0 && k>0; i--){
            int ops = Math.min(count[i],k);
            count[i] -= ops;
            count[i-1] += ops;
            k-=ops;
        }
        long res = 0;
        for(int i = 0; i < count.length;i++){
            res += (long)count[i] * i * i;
        }
        return res;
    }
}