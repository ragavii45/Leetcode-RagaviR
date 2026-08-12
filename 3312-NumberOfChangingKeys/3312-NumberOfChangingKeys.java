// Last updated: 12/08/2026, 21:28:16
class Solution {
    public int countKeyChanges(String s) {

        int count = 0;

        for (int i = 1; i < s.length(); i++) {

            char a = Character.toLowerCase(s.charAt(i - 1));
            char b = Character.toLowerCase(s.charAt(i));

            if (a != b) {
                count++;
            }
        }

        return count;
    }
}