// Last updated: 12/08/2026, 19:25:37
1class Solution {
2    public int[][] generateMatrix(int n) {
3
4        int[][] matrix = new int[n][n];
5
6        int top = 0;
7        int bottom = n - 1;
8        int left = 0;
9        int right = n - 1;
10
11        int value = 1;
12
13        while (top <= bottom && left <= right) {
14
15            for (int j = left; j <= right; j++) {
16                matrix[top][j] = value++;
17            }
18            top++;
19
20            for (int i = top; i <= bottom; i++) {
21                matrix[i][right] = value++;
22            }
23            right--;
24
25            if (top <= bottom) {
26                for (int j = right; j >= left; j--) {
27                    matrix[bottom][j] = value++;
28                }
29                bottom--;
30            }
31
32            if (left <= right) {
33                for (int i = bottom; i >= top; i--) {
34                    matrix[i][left] = value++;
35                }
36                left++;
37            }
38        }
39
40        return matrix;
41    }
42}