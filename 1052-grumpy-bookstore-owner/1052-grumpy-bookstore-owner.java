class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int count = 0;
        int additional = 0;
        int max = 0;
        for(int i = 0; i < customers.length; i++){
            if(grumpy[i] == 0){
                count += customers[i];
            }else{
                additional += customers[i];
            }

            if(i>= minutes && grumpy[i-minutes] == 1){
                additional -= customers[i-minutes];
            }
            if(additional > max){
                max = additional;
            }

        }return count + max;
    }
}