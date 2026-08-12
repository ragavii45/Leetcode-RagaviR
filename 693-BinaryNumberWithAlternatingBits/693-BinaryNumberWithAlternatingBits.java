// Last updated: 12/08/2026, 21:31:56
class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n >>= 1;

        while (n > 0) {
            int current = n & 1;

            if (current == prev) {
                return false;
            }

            prev = current;
            n >>= 1;
        }

        return true;
    }
}