// Last updated: 12/08/2026, 21:41:25
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);

            answer = Math.max(
                answer,
                right - left + 1
            );
        }

        return answer;
    }
}