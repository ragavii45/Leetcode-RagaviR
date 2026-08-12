// Last updated: 12/08/2026, 19:30:50
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int maxProduct = nums[0];
5        int minProduct = nums[0];
6        int answer = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            int num = nums[i];
11
12            if (num < 0) {
13                int temp = maxProduct;
14                maxProduct = minProduct;
15                minProduct = temp;
16            }
17
18            maxProduct = Math.max(
19                num,
20                maxProduct * num
21            );
22
23            minProduct = Math.min(
24                num,
25                minProduct * num
26            );
27
28            answer = Math.max(answer, maxProduct);
29        }
30
31        return answer;
32    }
33}