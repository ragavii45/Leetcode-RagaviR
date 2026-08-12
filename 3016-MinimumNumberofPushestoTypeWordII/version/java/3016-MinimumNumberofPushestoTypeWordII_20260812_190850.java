// Last updated: 12/08/2026, 19:08:50
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4
5        for (char c : word.toCharArray()) {
6            freq[c - 'a']++;
7        }
8
9        Arrays.sort(freq);
10
11        int pushes = 0;
12        int cost = 1;
13        int count = 0;
14
15        for (int i = 25; i >= 0; i--) {
16            if (freq[i] == 0) break;
17
18            pushes += freq[i] * cost;
19            count++;
20
21            if (count == 8) {
22                count = 0;
23                cost++;
24            }
25        }
26
27        return pushes;
28    }
29}