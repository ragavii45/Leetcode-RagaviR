// Last updated: 12/08/2026, 21:34:43
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;

        // Left products
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Right products
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] *= rightProduct;

            rightProduct *= nums[i];
        }

        return result;
    }
}