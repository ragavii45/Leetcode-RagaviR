// Last updated: 12/08/2026, 21:28:25
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        Map<Integer, Long> minPrefix = new HashMap<>();

        long prefix = 0;
        long answer = Long.MIN_VALUE;

        for (int num : nums) {

            if (minPrefix.containsKey(num - k)) {
                answer = Math.max(
                    answer,
                    prefix + num - minPrefix.get(num - k)
                );
            }

            if (minPrefix.containsKey(num + k)) {
                answer = Math.max(
                    answer,
                    prefix + num - minPrefix.get(num + k)
                );
            }

            minPrefix.put(
                num,
                Math.min(
                    minPrefix.getOrDefault(num, Long.MAX_VALUE),
                    prefix
                )
            );

            prefix += num;
        }

        return answer == Long.MIN_VALUE ? 0 : answer;
    }
}