class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n + m];
        for(int i = 0; i< n; i++){
            arr[i] = nums1[i];
        }
        for(int i = 0; i < m; i++){
            arr[i+n] = nums2[i];
        }
        Arrays.sort(arr);
        int s = m+n;
        if(s%2 != 0){
            int idx = s/2;
            double med = (double)arr[idx];
            return med;
        }
        int idx1 = (s+1)/2;
        int idx2 = (s-1)/2;        
        int num  = arr[idx1] + arr[idx2];
        return (double)num/2;
    }
}