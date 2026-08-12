// Last updated: 12/08/2026, 19:13:47
1class Solution {
2    public int sumDistance(int[] nums, String s, int d) {
3        long[] positions = new long[nums.length];
4
5        for (int i = 0; i < nums.length; i++) {
6            if (s.charAt(i) == 'R') {
7                positions[i] = (long) nums[i] + d;
8            } else {
9                positions[i] = (long) nums[i] - d;
10            }
11        }
12
13        Arrays.sort(positions);
14
15        long MOD = 1_000_000_007L;
16        long result = 0;
17        long prefix = 0;
18
19        for (int i = 0; i < positions.length; i++) {
20            result = (result + positions[i] * i - prefix) % MOD;
21            prefix = (prefix + positions[i]) % MOD;
22        }
23
24        return (int) result;
25    }
26}