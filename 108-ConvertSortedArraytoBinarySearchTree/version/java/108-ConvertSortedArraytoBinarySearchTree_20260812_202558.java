// Last updated: 12/08/2026, 20:25:58
1class Solution {
2
3    public TreeNode sortedArrayToBST(int[] nums) {
4        return build(nums, 0, nums.length - 1);
5    }
6
7    private TreeNode build(
8        int[] nums,
9        int left,
10        int right
11    ) {
12
13        if (left > right) {
14            return null;
15        }
16
17        int mid = left + (right - left) / 2;
18
19        TreeNode root = new TreeNode(nums[mid]);
20
21        root.left = build(nums, left, mid - 1);
22        root.right = build(nums, mid + 1, right);
23
24        return root;
25    }
26}