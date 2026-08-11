// Last updated: 11/08/2026, 14:18:26
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : deck)
            map.put(x, map.getOrDefault(x, 0) + 1);

        int g = 0;
        for (int v : map.values())
            g = gcd(g, v);

        return g >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}