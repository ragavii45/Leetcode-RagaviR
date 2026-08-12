// Last updated: 12/08/2026, 20:40:59
1import java.util.*;
2
3class Solution {
4
5    public boolean validPath(
6        int n,
7        int[][] edges,
8        int source,
9        int destination
10    ) {
11
12        List<List<Integer>> graph =
13            new ArrayList<>();
14
15        for (int i = 0; i < n; i++) {
16            graph.add(new ArrayList<>());
17        }
18
19        for (int[] edge : edges) {
20
21            graph.get(edge[0]).add(edge[1]);
22            graph.get(edge[1]).add(edge[0]);
23        }
24
25        boolean[] visited = new boolean[n];
26
27        Queue<Integer> queue = new LinkedList<>();
28
29        queue.offer(source);
30        visited[source] = true;
31
32        while (!queue.isEmpty()) {
33
34            int node = queue.poll();
35
36            if (node == destination) {
37                return true;
38            }
39
40            for (int next : graph.get(node)) {
41
42                if (!visited[next]) {
43
44                    visited[next] = true;
45                    queue.offer(next);
46                }
47            }
48        }
49
50        return false;
51    }
52}