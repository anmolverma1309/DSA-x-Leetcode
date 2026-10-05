class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            long total = (long)(i+1) * (arr.length-i);
            long odd = (total+1)/2; 
            sum+= odd*arr[i];
        }
        return (int)sum;
        // int sum = 0;
        // int win = 1;
        // if(arr.length %2 != 0){
        //     for(int i = 0; i < arr.length; i++){
        //         sum += arr[i];
        //     }
        // }
        // while(win< arr.length){
        //     int tempsum = 0;
        //     for(int i = 0; i < arr.length; i++){
        //         tempsum += arr[i];
        //         if(i>=win-1){
        //             sum += tempsum;
        //             tempsum -= arr[i-win+1];
        //         }
        //     }
        //     win +=2;
        // }

        // return sum;
    }
}