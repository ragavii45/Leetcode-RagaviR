// Last updated: 12/08/2026, 19:39:59
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3
4        int i = 0;
5        int j = 0;
6
7        while (i < s.length() && j < t.length()) {
8
9            if (s.charAt(i) == t.charAt(j)) {
10                i++;
11            }
12
13            j++;
14        }
15
16        return i == s.length();
17    }
18}