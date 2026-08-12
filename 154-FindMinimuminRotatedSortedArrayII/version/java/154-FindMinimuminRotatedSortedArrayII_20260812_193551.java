// Last updated: 12/08/2026, 19:35:51
1class Solution {
2    public int findMin(int[] nums) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left < right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] < nums[right]) {
12
13                right = mid;
14
15            } else if (nums[mid] > nums[right]) {
16
17                left = mid + 1;
18
19            } else {
20
21                right--;
22            }
23        }
24
25        return nums[left];
26    }
27}