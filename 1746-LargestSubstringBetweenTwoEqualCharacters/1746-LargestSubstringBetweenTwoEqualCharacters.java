// Last updated: 12/08/2026, 21:29:49
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int[] first = new int[26];

        for (int i = 0; i < 26; i++) {
            first[i] = -1;
        }

        int answer = -1;

        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            } else {
                answer = Math.max(
                    answer,
                    i - first[index] - 1
                );
            }
        }

        return answer;
    }
}