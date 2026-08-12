// Last updated: 12/08/2026, 21:29:27
class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean present : seen) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}