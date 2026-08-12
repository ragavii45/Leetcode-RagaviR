// Last updated: 12/08/2026, 19:17:23
1class Solution {
2
3    public int splitArray(int[] nums, int k) {
4
5        long low = 0;
6        long high = 0;
7
8        for (int num : nums) {
9            low = Math.max(low, num);
10            high += num;
11        }
12
13        while (low < high) {
14
15            long mid = low + (high - low) / 2;
16
17            if (canSplit(nums, k, mid)) {
18                high = mid;
19            } else {
20                low = mid + 1;
21            }
22        }
23
24        return (int) low;
25    }
26
27    private boolean canSplit(int[] nums, int k, long maxSum) {
28
29        int parts = 1;
30        long currentSum = 0;
31
32        for (int num : nums) {
33
34            if (currentSum + num > maxSum) {
35                parts++;
36                currentSum = num;
37
38                if (parts > k) {
39                    return false;
40                }
41            } else {
42                currentSum += num;
43            }
44        }
45
46        return true;
47    }
48}