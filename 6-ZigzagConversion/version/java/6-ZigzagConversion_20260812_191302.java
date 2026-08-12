// Last updated: 12/08/2026, 19:13:02
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || numRows >= s.length()) {
4            return s;
5        }
6
7        StringBuilder[] rows = new StringBuilder[numRows];
8
9        for (int i = 0; i < numRows; i++) {
10            rows[i] = new StringBuilder();
11        }
12
13        int row = 0;
14        int direction = 1;
15
16        for (char c : s.toCharArray()) {
17            rows[row].append(c);
18
19            if (row == 0) {
20                direction = 1;
21            } else if (row == numRows - 1) {
22                direction = -1;
23            }
24
25            row += direction;
26        }
27
28        StringBuilder result = new StringBuilder();
29
30        for (StringBuilder r : rows) {
31            result.append(r);
32        }
33
34        return result.toString();
35    }
36}