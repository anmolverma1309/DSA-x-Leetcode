class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> pascal = new ArrayList<>();
        pascal.add(1);
        for(int i = 1; i<= rowIndex; i++){
            pascal.add(1);
            for(int j = i-1; j > 0; j--){
                pascal.set(j,pascal.get(j) + pascal.get(j-1));
            }
        }
        return pascal;


        // ArrayList <List<Integer>> pascal = new ArrayList<>();
        // for (int i = 0; i <= rowIndex; i++){
        //     ArrayList <Integer> arr = new ArrayList<>();
        //     for(int j = 0; j<= i; j++){
        //         if(j == 0 || j == i){
        //             arr.add(1);
        //         }else{
        //             arr.add((pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j)));
        //         }
        //     }
        //     pascal.add(arr);
        // }
        // return pascal.get(rowIndex);
        
    }
}