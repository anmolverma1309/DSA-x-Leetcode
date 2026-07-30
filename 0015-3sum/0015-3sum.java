class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList <List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int first = 0; first < n-2; first++){
            if(first> 0 && nums[first] == nums[first-1]){
                continue;
            }
            int lp = first+1;
            int rp = n-1;
            while(lp < rp){
                int sum = nums[first] + nums[lp] + nums[rp];
                if(sum == 0){
                    arr.add(Arrays.asList(nums[first], nums[lp], nums[rp]));
                    lp++;
                    rp--;
                    while(lp < rp && nums[lp] == nums[lp-1]){
                        lp++;
                    }
                    while(lp < rp && nums[rp] == nums[rp+1]){
                        rp--;
                    }
                }else if(sum < 0){
                    lp++;
                }else{
                    rp--;;
                }
                
            }
            
        }
        return arr;  
    }
}