// Last updated: 11/08/2026, 14:18:06
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n == 1) return 1;
        int curr = 1;
        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            int cmp = Integer.compare(arr[i - 1], arr[i]);
            if (cmp == 0) {
                curr = 1;
            } else if (i == 1 || cmp * Integer.compare(arr[i - 2], arr[i - 1]) != -1) {
                curr = 2;
            } else {
                curr++;
            }
            maxLen = Math.max(maxLen, curr);
        }
        return maxLen;
    }
}