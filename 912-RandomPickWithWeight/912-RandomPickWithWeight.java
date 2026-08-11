// Last updated: 11/08/2026, 14:18:34
class Solution {
    int[] prefix;
    Random rand = new Random();

    public Solution(int[] w) {
        prefix = new int[w.length];
        prefix[0] = w[0];
        for (int i = 1; i < w.length; i++)
            prefix[i] = prefix[i - 1] + w[i];
    }

    public int pickIndex() {
        int target = rand.nextInt(prefix[prefix.length - 1]) + 1;

        int l = 0, r = prefix.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (prefix[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}