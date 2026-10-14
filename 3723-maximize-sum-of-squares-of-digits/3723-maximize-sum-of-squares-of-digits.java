class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if(num == 1 && sum >9) return "";
        if(sum > 9*num) return "";
        while(sum > 0){
            if(sum>9){
                sb.append(9);
                sum -= 9;
                num--;
            }else{
                sb.append(sum);
                sum = 0;
                num--;
            } 
        }
        while(num > 0){
            sb.append(0);
            num--;
        }
        return sb.toString();
    }
}