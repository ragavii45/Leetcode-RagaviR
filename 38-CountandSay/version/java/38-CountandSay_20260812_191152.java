// Last updated: 12/08/2026, 19:11:52
1class Solution {
2    public String countAndSay(int n) {
3        String result = "1";
4
5        for (int i = 2; i <= n; i++) {
6            StringBuilder next = new StringBuilder();
7
8            int count = 1;
9
10            for (int j = 1; j < result.length(); j++) {
11                if (result.charAt(j) == result.charAt(j - 1)) {
12                    count++;
13                } else {
14                    next.append(count);
15                    next.append(result.charAt(j - 1));
16                    count = 1;
17                }
18            }
19
20            next.append(count);
21            next.append(result.charAt(result.length() - 1));
22
23            result = next.toString();
24        }
25
26        return result;
27    }
28}