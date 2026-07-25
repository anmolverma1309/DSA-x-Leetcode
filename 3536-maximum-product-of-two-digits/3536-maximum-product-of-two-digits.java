class Solution {
    public int maxProduct(int n) {

        int first = 0;
        int sec = 0;
        while(n > 0){
            int digit = n % 10;
            if( digit >= first){
                sec = first;
                first = digit;
            }
            else if( digit > sec){
                sec = digit;
            }
            n /= 10;
        }
        return first * sec;
    }


    // 3ms
    //     int max = 0;
    //     ArrayList <Integer> arr = new ArrayList<>();
    //     int temp =n;
    //     while (temp > 0){
            
    //         arr.add(temp%10);
    //         temp /= 10;
    //     }
    //     Collections.sort(arr);
    //     return arr.get(arr.size()-1) * arr.get(arr.size()-2);
    // }
}