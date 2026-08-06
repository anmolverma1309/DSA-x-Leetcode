class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;

        while(true){
            int prod = 1;
            int num = temp;
            while(num > 0){
                prod *= num%10;
                num /= 10;
            }
            if(prod %t == 0){
                return temp;
            }else{
                temp++;
            }
        }
        
    }
}