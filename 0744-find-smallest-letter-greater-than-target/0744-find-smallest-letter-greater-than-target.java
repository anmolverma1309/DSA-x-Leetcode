class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char smallest = letters[0];
        for(int i = letters.length-1; i >= 0; i--){
            if(letters[i] > target){
                smallest = letters[i];
            }
        }return smallest;
    }
}