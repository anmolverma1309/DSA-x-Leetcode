class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList <Integer> arr = new ArrayList<>();
        int less = 0, tar = 0;
        for(int num: nums){
            if(num < target) less++;
            else if(num == target) tar++;
        }
        for(int i = 0; i < tar; i++) arr.add(less + i);
        return arr;
    }
}