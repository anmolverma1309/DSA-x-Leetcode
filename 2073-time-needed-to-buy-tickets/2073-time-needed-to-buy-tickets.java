class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int time = 0,i=0;
        int n = tickets.length;
        
        while(tickets[k] != 0){
            if(tickets[i%n] == 0){
                i++;
                continue;
            } 
             
            tickets[i%n] -= 1;
            time++;
            i++;
        }
        return time;
    }
}