// Last updated: 12/08/2026, 19:22:19
1import java.util.*;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5
6        int n = nums1.length;
7
8        Set<Integer> set1 = new HashSet<>();
9        Set<Integer> set2 = new HashSet<>();
10
11        for (int x : nums1) {
12            set1.add(x);
13        }
14
15        for (int x : nums2) {
16            set2.add(x);
17        }
18
19        int common = 0;
20
21        for (int x : set1) {
22            if (set2.contains(x)) {
23                common++;
24            }
25        }
26
27        int only1 = set1.size() - common;
28        int only2 = set2.size() - common;
29
30        int take1 = Math.min(only1, n / 2);
31        int take2 = Math.min(only2, n / 2);
32
33        int remaining1 = n / 2 - take1;
34        int remaining2 = n / 2 - take2;
35
36        int commonUsed = Math.min(common, remaining1 + remaining2);
37
38        return take1 + take2 + commonUsed;
39    }
40}