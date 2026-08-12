// Last updated: 12/08/2026, 21:28:22
class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        int[] sorted = freq.clone();

        java.util.Arrays.sort(sorted);

        int answer = 0;
        int push = 1;
        int count = 0;

        for (int i = 25; i >= 0; i--) {

            if (sorted[i] == 0) {
                break;
            }

            answer += sorted[i] * push;

            count++;

            if (count == 8) {
                count = 0;
                push++;
            }
        }

        return answer;
    }
}