// Last updated: 11/08/2026, 14:16:41
class Solution {
    public int minInsertions(String s) {
        int res = 0, need = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // Each '(' needs two ')'
                need += 2;

                // If need is odd, insert one ')'
                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            } else { // ')'
                need--;

                // If need becomes negative, insert '('
                if (need == -1) {
                    res++;
                    need = 1;
                }
            }
        }

        return res + need;
    }
}