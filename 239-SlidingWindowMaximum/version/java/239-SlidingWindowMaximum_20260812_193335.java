// Last updated: 12/08/2026, 19:33:35
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5
6        int n = nums.length;
7
8        int[] result = new int[n - k + 1];
9
10        Deque<Integer> deque = new ArrayDeque<>();
11
12        for (int i = 0; i < n; i++) {
13
14            // Remove elements outside the window
15            while (!deque.isEmpty() &&
16                   deque.peekFirst() <= i - k) {
17
18                deque.pollFirst();
19            }
20
21            // Remove smaller elements
22            while (!deque.isEmpty() &&
23                   nums[deque.peekLast()] <= nums[i]) {
24
25                deque.pollLast();
26            }
27
28            deque.offerLast(i);
29
30            // Window is ready
31            if (i >= k - 1) {
32                result[i - k + 1] = nums[deque.peekFirst()];
33            }
34        }
35
36        return result;
37    }
38}