// Last updated: 12/08/2026, 21:28:45
import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        Set<String> set = new HashSet<>();

        int count = 0;

        for (String word : words) {

            String reverse =
                new StringBuilder(word).reverse().toString();

            if (set.contains(reverse)) {
                count++;
            }

            set.add(word);
        }

        return count;
    }
}