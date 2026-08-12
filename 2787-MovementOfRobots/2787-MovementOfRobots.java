// Last updated: 12/08/2026, 21:28:49
class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        long[] positions = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (s.charAt(i) == 'R') {
                positions[i] = (long) nums[i] + d;
            } else {
                positions[i] = (long) nums[i] - d;
            }
        }

        Arrays.sort(positions);

        long MOD = 1_000_000_007L;
        long result = 0;
        long prefix = 0;

        for (int i = 0; i < positions.length; i++) {
            result = (result + positions[i] * i - prefix) % MOD;
            prefix = (prefix + positions[i]) % MOD;
        }

        return (int) result;
    }
}