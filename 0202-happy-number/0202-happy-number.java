class Solution {
    public static int sumofsquare(int n){
        int sum = 0;
        while(n > 0){
            int num = n%10;
            sum += num * num;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet <Integer> ans = new HashSet<>();
        while(n != 1){
            int num = n;
            if(ans.contains(n)){
                return false;
            }
            ans.add(n);
            n = sumofsquare(n); 
        }
        return true;
    }
    
}