// Last updated: 12/08/2026, 20:46:29
1class Solution {
2    public int[] countBits(int n) {
3
4        int[] answer = new int[n + 1];
5
6        for (int i = 1; i <= n; i++) {
7
8            answer[i] =
9                answer[i / 2] + (i % 2);
10        }
11
12        return answer;
13    }
14}