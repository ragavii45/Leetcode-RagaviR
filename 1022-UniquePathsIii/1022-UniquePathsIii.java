// Last updated: 11/08/2026, 14:17:58
class Solution {
    int paths = 0;
    int empty = 1; // Count starting square also
    int startX, startY;
    
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    empty++;
                else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        
        dfs(grid, startX, startY, empty);
        return paths;
    }
    
    private void dfs(int[][] grid, int x, int y, int remain) {
        int m = grid.length, n = grid[0].length;
        
        // Out of bounds or obstacle/visited
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == -1)
            return;
        
        // Reached end
        if (grid[x][y] == 2) {
            if (remain == 0)
                paths++;
            return;
        }
        
        // Mark visited
        int temp = grid[x][y];
        grid[x][y] = -1;
        
        dfs(grid, x + 1, y, remain - 1);
        dfs(grid, x - 1, y, remain - 1);
        dfs(grid, x, y + 1, remain - 1);
        dfs(grid, x, y - 1, remain - 1);
        
        // Backtrack
        grid[x][y] = temp;
    }
}