class Solution {
    public static void reverse(int nums[], int lp, int rp){
        while(lp< rp){
            int temp = nums[lp];
            nums[lp] = nums [rp];
            nums[rp] = temp;
            lp++;
            rp--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    //     int arr[] = new int [nums.length];
    //     int j =0;
    //     for (int i =nums.length-1; i >= 0; i--){
    //         arr[j] = nums[i];
    //         j++;
    //     }
    //     int lp = 0;
    //     int rp = k-1;

    //     for (int i = lp; i<= rp; i++){
    //         int temp = arr[lp];
    //         arr[lp] = arr[rp];
    //         arr[rp] = temp;
    //         lp++;
    //         rp--;

    //     }
    //     int first = k;
    //     int last = nums.length-1;
    //     for (int i = k; i<= last; i++ ){
    //         int temp = arr[first];
    //         arr[first] = arr[last];
    //         arr[last] = temp;
    //         first++;
    //         last--;
    //     }

    //     for(int i = 0; i< nums.length; i++){
    //         nums[i] = arr[i];
    //     }
       

        
    // }
}