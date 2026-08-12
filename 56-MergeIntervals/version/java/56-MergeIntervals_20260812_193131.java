// Last updated: 12/08/2026, 19:31:31
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5
6        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
7
8        List<int[]> result = new ArrayList<>();
9
10        int start = intervals[0][0];
11        int end = intervals[0][1];
12
13        for (int i = 1; i < intervals.length; i++) {
14
15            if (intervals[i][0] <= end) {
16
17                end = Math.max(
18                    end,
19                    intervals[i][1]
20                );
21
22            } else {
23
24                result.add(new int[]{start, end});
25
26                start = intervals[i][0];
27                end = intervals[i][1];
28            }
29        }
30
31        result.add(new int[]{start, end});
32
33        return result.toArray(new int[result.size()][]);
34    }
35}