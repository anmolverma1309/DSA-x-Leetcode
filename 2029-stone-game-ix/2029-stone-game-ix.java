class Solution {
    public boolean stoneGameIX(int[] stones) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0; i<stones.length; i++){
            int r = stones[i] %3;
            if(r == 0){
                zero++;
            }else if(r == 1){
                one++;
            }else if(r == 2){
                two++;
            }
        }
        if( zero %2 ==0){
            return one > 0 && two > 0;
        }else{
            return Math.abs(one-two) >2;
        }
    }
}