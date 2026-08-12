// Last updated: 12/08/2026, 21:40:13
class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;
        solve(board);
    }
    
    private boolean solve(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, r, c, num)) {
                            board[r][c] = num; 
                            if (solve(board)) {
                                return true;
                            }
                            board[r][c] = '.'; 
                        }
                    }
                    return false; 
                } // <--- FIXED: This closing brace for "if (board[r][c] == '.')" was missing!
            }
        }
        return true; 
    }
    
    private boolean isValid(char[][] board, int row, int col, char num) {
        int boxRowStart = 3 * (row / 3);
        int boxColStart = 3 * (col / 3);
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
            if (board[i][col] == num) return false;
            if (board[boxRowStart + i / 3][boxColStart + i % 3] == num) return false;
        }
        return true;
    }
}
