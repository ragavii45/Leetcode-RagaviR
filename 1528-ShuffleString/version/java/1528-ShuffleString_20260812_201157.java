// Last updated: 12/08/2026, 20:11:57
1class Solution {
2    public String restoreString(String s, int[] indices) {
3
4        char[] result = new char[s.length()];
5
6        for (int i = 0; i < s.length(); i++) {
7            result[indices[i]] = s.charAt(i);
8        }
9
10        return new String(result);
11    }
12}