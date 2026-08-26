class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] boxes = new HashSet[9];
        for(int i = 0; i < 9; i++){
            boxes[i] = new HashSet<>();
        }
        for(int i = 0; i< board.length; i++){
            HashSet<Character> row = new HashSet<>();
            for(int j = 0; j< board[i].length; j++){
                if(board[i][j] == '.') {
                    continue;
                }
                if(row.contains(board[i][j])){
                    return false;
                }else{
                    row.add(board[i][j]);
                }
            }
        }for(int i = 0; i < board.length; i++){
            HashSet<Character> column = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(column.contains(board[j][i])){
                    return false;
                }
                column.add(board[j][i]);
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int boxid = (i / 3) * 3 + j / 3;
                if(boxes[boxid].contains(board[i][j])){
                    return false;
                }
                boxes[boxid].add(board[i][j]);
            }
        }
        return true;
    }
}