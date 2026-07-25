class Solution {
    public int maxProduct(int n) {
        int max = 0;
        ArrayList <Integer> arr = new ArrayList<>();
        int temp =n;
        while (temp > 0){
            
            arr.add(temp%10);
            temp /= 10;
        }
        
        Collections.sort(arr);
        
        return arr.get(arr.size()-1) * arr.get(arr.size()-2);
    }
}