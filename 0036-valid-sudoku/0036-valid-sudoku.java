class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for(int i = 0; i < 9; i++){
            boxes[i] = new HashSet<>();
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
        }
        for(int i = 0; i< board.length; i++){
            for(int  j = 0; j< board[i].length;j++){
                char nums = board[i][j];
                int boxid = (i/3)*3 +j/3;
                if(nums == '.'){
                    continue;
                }
                if(rows[i].contains(nums)|| columns[j].contains(nums)|| boxes[boxid].contains(nums)){
                    return false;
                }
                rows[i].add(nums);
                columns[j].add(nums);
                boxes[boxid].add(nums);

            }
        }return true;
        // HashSet<Character>[] boxes = new HashSet[9];
        // for(int i = 0; i < 9; i++){
        //     boxes[i] = new HashSet<>();
        // }
        // for(int i = 0; i< board.length; i++){
        //     HashSet<Character> row = new HashSet<>();
        //     for(int j = 0; j< board[i].length; j++){
        //         if(board[i][j] == '.') {
        //             continue;
        //         }
        //         if(row.contains(board[i][j])){
        //             return false;
        //         }else{
        //             row.add(board[i][j]);
        //         }
        //     }
        // }for(int i = 0; i < board.length; i++){
        //     HashSet<Character> column = new HashSet<>();
        //     for(int j = 0; j < board[i].length; j++){
        //         if(board[j][i] == '.'){
        //             continue;
        //         }
        //         if(column.contains(board[j][i])){
        //             return false;
        //         }
        //         column.add(board[j][i]);
        //     }
        // }
        // for(int i = 0; i < board.length; i++){
        //     for(int j = 0; j < board[i].length; j++){
        //         if(board[i][j] == '.'){
        //             continue;
        //         }
        //         int boxid = (i / 3) * 3 + j / 3;
        //         if(boxes[boxid].contains(board[i][j])){
        //             return false;
        //         }
        //         boxes[boxid].add(board[i][j]);
        //     }
        // }
        // return true;
    }
}