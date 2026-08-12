// Last updated: 12/08/2026, 21:30:44
import java.util.*;

class Solution {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.offer(first - second);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}