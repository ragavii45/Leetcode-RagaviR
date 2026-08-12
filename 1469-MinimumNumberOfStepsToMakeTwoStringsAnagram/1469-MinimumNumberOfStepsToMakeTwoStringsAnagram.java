// Last updated: 12/08/2026, 21:30:05
class Solution {
    public int minSteps(String s, String t) {

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        int answer = 0;

        for (int x : count) {
            if (x > 0) {
                answer += x;
            }
        }

        return answer;
    }
}