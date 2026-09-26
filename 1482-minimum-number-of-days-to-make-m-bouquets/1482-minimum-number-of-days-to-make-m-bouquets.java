class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        for(int x: bloomDay){
            if(x < s){
                s = x;
            }
            if(x>e){
                e = x;
            }
        }
        if((long)m *k > bloomDay.length) return -1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(bloom(bloomDay, m,k, mid)){
                e = mid;
            }else{
                s = mid+1;
            }
        }return s;
    }
    private boolean bloom(int bloomDay[], int m, int k, int mid){
        int count = 0;
        int bouquet = 0;
        for(int blo: bloomDay){
            if(blo <= mid){
                count++;
                if(count == k){
                    bouquet++;
                    count = 0;
                }
            }else{
                count = 0;
            }
            if(bouquet >= m){
                return true;
            }
        }return false;
    }
}