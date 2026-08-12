// Last updated: 12/08/2026, 19:27:39
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5
6        Set<Integer> set = new HashSet<>();
7
8        for (int num : nums) {
9            set.add(num);
10        }
11
12        int longest = 0;
13
14        for (int num : set) {
15
16            if (!set.contains(num - 1)) {
17
18                int current = num;
19                int length = 1;
20
21                while (set.contains(current + 1)) {
22                    current++;
23                    length++;
24                }
25
26                longest = Math.max(longest, length);
27            }
28        }
29
30        return longest;
31    }
32}