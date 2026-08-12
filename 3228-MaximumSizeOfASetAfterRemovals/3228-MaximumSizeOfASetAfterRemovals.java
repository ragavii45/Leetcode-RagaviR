// Last updated: 12/08/2026, 21:28:37
import java.util.*;

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {

        int n = nums1.length;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        int common = 0;

        for (int x : set1) {
            if (set2.contains(x)) {
                common++;
            }
        }

        int only1 = set1.size() - common;
        int only2 = set2.size() - common;

        int take1 = Math.min(only1, n / 2);
        int take2 = Math.min(only2, n / 2);

        int remaining1 = n / 2 - take1;
        int remaining2 = n / 2 - take2;

        int commonUsed = Math.min(common, remaining1 + remaining2);

        return take1 + take2 + commonUsed;
    }
}