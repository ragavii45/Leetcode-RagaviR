// Last updated: 12/08/2026, 21:29:24
class Solution {
    public boolean makeEqual(String[] words) {

        int[] count = new int[26];

        for (String word : words) {

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }

        for (int frequency : count) {

            if (frequency % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}