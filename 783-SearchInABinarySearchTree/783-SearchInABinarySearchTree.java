// Last updated: 12/08/2026, 21:31:36
class Solution {

    public TreeNode searchBST(
        TreeNode root,
        int val
    ) {

        while (root != null) {

            if (root.val == val) {
                return root;
            }

            if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }
}