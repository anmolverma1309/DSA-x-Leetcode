class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList <List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++){
            ArrayList <Integer> arr = new ArrayList<>();
            for(int j = 0; j<= i; j++){
                if(j == 0 || j == i){
                    arr.add(1);
                }else{
                    arr.add((pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j)));
                }
            }
            pascal.add(arr);
        }
        return pascal.get(rowIndex);
        
    }
}