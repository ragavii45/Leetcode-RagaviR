// Last updated: 12/08/2026, 19:16:19
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rows = new boolean[9][9];
4        boolean[][] cols = new boolean[9][9];
5        boolean[][] boxes = new boolean[9][9];
6
7        for (int i = 0; i < 9; i++) {
8
9            for (int j = 0; j < 9; j++) {
10
11                if (board[i][j] == '.') {
12                    continue;
13                }
14
15                int num = board[i][j] - '1';
16
17                int box = (i / 3) * 3 + (j / 3);
18
19                if (rows[i][num] ||
20                    cols[j][num] ||
21                    boxes[box][num]) {
22
23                    return false;
24                }
25
26                rows[i][num] = true;
27                cols[j][num] = true;
28                boxes[box][num] = true;
29            }
30        }
31
32        return true;
33    }
34}