class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int max = 0;
        int count = 1;
        int num = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                count++;
            }else{
                if(count > nums.length/3){
                    ans.add(nums[i-1]);
                }
                count =1;
            }

            
        }
        if(count > nums.length/3){
            ans.add(nums[nums.length-1]);
        }
        return ans;
    }
}