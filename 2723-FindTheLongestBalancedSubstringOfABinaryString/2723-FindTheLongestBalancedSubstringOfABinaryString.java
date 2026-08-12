// Last updated: 12/08/2026, 21:28:54
class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int answer = 0;

        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {

                zeros++;

            } else {

                ones++;

                if (i > 0 && s.charAt(i - 1) == '0') {
                    // Start counting the new 1-group
                }
            }

            if (i > 0 &&
                s.charAt(i) == '1' &&
                s.charAt(i - 1) == '0') {

                int j = i;

                while (j < s.length() &&
                       s.charAt(j) == '1') {
                    j++;
                }

                int oneCount = j - i;

                answer = Math.max(
                    answer,
                    2 * Math.min(zeros, oneCount)
                );

                zeros = 0;
            }
        }

        return answer;
    }
}