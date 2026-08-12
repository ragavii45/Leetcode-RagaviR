// Last updated: 12/08/2026, 19:15:29
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> frequency = new HashMap<>();
4
5        for (int num : nums) {
6            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
7        }
8
9        PriorityQueue<Integer> pq =
10            new PriorityQueue<>((a, b) ->
11                frequency.get(a) - frequency.get(b));
12
13        for (int num : frequency.keySet()) {
14            pq.offer(num);
15
16            if (pq.size() > k) {
17                pq.poll();
18            }
19        }
20
21        int[] result = new int[k];
22
23        for (int i = k - 1; i >= 0; i--) {
24            result[i] = pq.poll();
25        }
26
27        return result;
28    }
29}