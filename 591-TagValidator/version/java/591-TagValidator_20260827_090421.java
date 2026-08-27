// Last updated: 27/08/2026, 09:04:21
1import java.util.*;
2
3class Solution {
4    public boolean isValid(String code) {
5
6        Stack<String> stack = new Stack<>();
7
8        int i = 0;
9        int n = code.length();
10
11        while (i < n) {
12
13            // CDATA
14            if (code.startsWith("<![CDATA[", i)) {
15
16                if (stack.isEmpty()) {
17                    return false;
18                }
19
20                int end = code.indexOf("]]>", i + 9);
21
22                if (end == -1) {
23                    return false;
24                }
25
26                i = end + 3;
27            }
28
29            // Closing tag
30            else if (code.startsWith("</", i)) {
31
32                int end = code.indexOf('>', i + 2);
33
34                if (end == -1) {
35                    return false;
36                }
37
38                String tag =
39                    code.substring(i + 2, end);
40
41                if (!isValidTagName(tag)) {
42                    return false;
43                }
44
45                if (stack.isEmpty() ||
46                    !stack.pop().equals(tag)) {
47
48                    return false;
49                }
50
51                i = end + 1;
52
53                // Everything must be inside the root tag
54                if (stack.isEmpty() && i != n) {
55                    return false;
56                }
57            }
58
59            // Opening tag
60            else if (code.charAt(i) == '<') {
61
62                int end = code.indexOf('>', i + 1);
63
64                if (end == -1) {
65                    return false;
66                }
67
68                String tag =
69                    code.substring(i + 1, end);
70
71                if (!isValidTagName(tag)) {
72                    return false;
73                }
74
75                stack.push(tag);
76
77                i = end + 1;
78            }
79
80            // Normal character
81            else {
82
83                if (stack.isEmpty()) {
84                    return false;
85                }
86
87                i++;
88            }
89        }
90
91        return stack.isEmpty();
92    }
93
94    private boolean isValidTagName(String tag) {
95
96        if (tag.length() < 1 ||
97            tag.length() > 9) {
98
99            return false;
100        }
101
102        for (char c : tag.toCharArray()) {
103
104            if (c < 'A' || c > 'Z') {
105                return false;
106            }
107        }
108
109        return true;
110    }
111}