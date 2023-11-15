class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length() > board.length * board[0].length) return false;
        //~ not possible, if board has lower char frequency that target
        // O(n*m)
        int [] F = new int[256];
        for(int r=0; r < board.length; ++r) {
            for(int c=0; c < board[0].length; ++c) {
                F[board[r][c]] += 1;
            }
        }

        for(char v : word.toCharArray()) {
            F[v] -= 1;
            if(F[v] < 0) return false;
        }
   
       //~ check for arrangement. Exponential exploration 
       for(int r=0; r < board.length; ++r) {
        for(int c=0; c < board[0].length; ++c) {
            boolean res = search(board, word, r, c, 0);
            if(res) return true;
        }
       } 
       return false;
    }

    boolean search(char [][] board, String word, int r, int c, int pos) {
        if(pos >= word.length()) return true;
        char v = word.charAt(pos++);
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != v) return false;


        board[r][c] ^= '#';
        boolean res = search(board, word, r+1, c, pos) 
                        || search(board, word, r, c+1, pos)
                        || search(board, word, r-1, c, pos)
                        || search(board, word, r, c-1, pos);
        board[r][c] ^= '#';
        return res;
    }
}
