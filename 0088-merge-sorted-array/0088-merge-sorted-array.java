class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int [m+n];
        int k = 0;
        int p1 = 0;
        int p2= 0;
        while(p1 < m && p2< n){
            if(nums1[p1] >= nums2[p2]){
                arr[k] = nums2[p2];
                k++;
                p2++;
            }else{
                arr[k] = nums1[p1];
                k++;
                p1++;
            }
        }
        while( p1 != m){
            arr[k] = nums1[p1];
            p1++;
            k++;
        }
        while(p2 != n){
            arr[k] = nums2[p2];
            p2++;
            k++;
        }
        int i = 0;

        for( i = 0, k=0; i<arr.length; i++, k++){
            nums1[i] = arr[k];
        }
        
        
    }
}