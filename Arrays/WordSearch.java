//code is similar to find no. of islands, what you basically do is travverse through the matrix normally until you find the first letter of the word, when found you call a function that recursively checks the adjacent cells to find the rest of the word, if found it returns true else false and continues to traverse he matrix

class Solution {

public boolean exist(char[][] board, String word) {
    int rows = board.length;
    int cols = board[0].length;
    boolean [][]visited = new boolean[rows][cols];
    
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            if(word.charAt(0) == board[i][j] && searchWord(i, j, 0, word, board, visited)){
                return true;
            }
            
        }
    }
    return false;
    
}

public boolean searchWord(int i, int j, int index, String word, char[][]board, boolean[][]visited){
    
    if(word.length() == index){
        return true;
    }
    if(i<0 || i>=board.length || j<0 ||j>=board[0].length || word.charAt(index) != board[i][j] ||
       visited[i][j]){
        return false;
    }
    visited[i][j] = true;
    if(searchWord(i+1, j, index+1, word, board, visited) ||
       searchWord(i-1, j, index+1, word, board, visited) ||
       searchWord(i, j+1, index+1, word, board, visited) ||
       searchWord(i, j-1, index+1, word, board, visited)) {
        return true;
    }
    visited[i][j] = false;
    return false;
}
}
