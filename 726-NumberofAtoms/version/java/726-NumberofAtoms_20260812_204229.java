// Last updated: 12/08/2026, 20:42:29
1import java.util.*;
2
3class Solution {
4
5    public String countOfAtoms(String formula) {
6
7        Stack<Map<String, Integer>> stack =
8            new Stack<>();
9
10        stack.push(new HashMap<>());
11
12        int i = 0;
13
14        while (i < formula.length()) {
15
16            char c = formula.charAt(i);
17
18            if (c == '(') {
19
20                stack.push(new HashMap<>());
21                i++;
22
23            } else if (c == ')') {
24
25                i++;
26
27                int start = i;
28
29                while (i < formula.length() &&
30                       Character.isDigit(formula.charAt(i))) {
31                    i++;
32                }
33
34                int multiplier =
35                    start == i
36                    ? 1
37                    : Integer.parseInt(
38                        formula.substring(start, i)
39                    );
40
41                Map<String, Integer> top =
42                    stack.pop();
43
44                Map<String, Integer> current =
45                    stack.peek();
46
47                for (Map.Entry<String, Integer> entry
48                     : top.entrySet()) {
49
50                    current.put(
51                        entry.getKey(),
52                        current.getOrDefault(entry.getKey(), 0)
53                        + entry.getValue() * multiplier
54                    );
55                }
56
57            } else {
58
59                int start = i;
60
61                i++;
62
63                while (i < formula.length() &&
64                       Character.isLowerCase(formula.charAt(i))) {
65                    i++;
66                }
67
68                String atom =
69                    formula.substring(start, i);
70
71                start = i;
72
73                while (i < formula.length() &&
74                       Character.isDigit(formula.charAt(i))) {
75                    i++;
76                }
77
78                int count =
79                    start == i
80                    ? 1
81                    : Integer.parseInt(
82                        formula.substring(start, i)
83                    );
84
85                Map<String, Integer> current =
86                    stack.peek();
87
88                current.put(
89                    atom,
90                    current.getOrDefault(atom, 0) + count
91                );
92            }
93        }
94
95        Map<String, Integer> map = stack.peek();
96
97        StringBuilder result = new StringBuilder();
98
99        for (String atom : new TreeSet<>(map.keySet())) {
100
101            result.append(atom);
102
103            int count = map.get(atom);
104
105            if (count > 1) {
106                result.append(count);
107            }
108        }
109
110        return result.toString();
111    }
112}