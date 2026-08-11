// Last updated: 11/08/2026, 14:19:38
class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                // Check skipping left
                if (isPal(s, l + 1, r)) return true;
                // Check skipping right
                if (isPal(s, l, r - 1)) return true;
                return false;
            }
        }
        return true;
    }

    private boolean isPal(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}