class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length-1;
        for (int i =0; i<=numbers.length; i++){
            while (lp< rp){
                if(numbers[lp]+ numbers[rp] == target){
                    int arr[] = {lp+1,rp+1};
                    return arr;
                }
                if(numbers[lp]+ numbers[rp] > target){
                    rp--;
                }
                else{
                    lp++;
                }

            }
        }int arr[] = {-1,-1};
        return arr;
        
    }
}