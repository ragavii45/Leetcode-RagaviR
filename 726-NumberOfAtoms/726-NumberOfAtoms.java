// Last updated: 12/08/2026, 21:31:53
import java.util.*;

class Solution {

    public String countOfAtoms(String formula) {

        Stack<Map<String, Integer>> stack =
            new Stack<>();

        stack.push(new HashMap<>());

        int i = 0;

        while (i < formula.length()) {

            char c = formula.charAt(i);

            if (c == '(') {

                stack.push(new HashMap<>());
                i++;

            } else if (c == ')') {

                i++;

                int start = i;

                while (i < formula.length() &&
                       Character.isDigit(formula.charAt(i))) {
                    i++;
                }

                int multiplier =
                    start == i
                    ? 1
                    : Integer.parseInt(
                        formula.substring(start, i)
                    );

                Map<String, Integer> top =
                    stack.pop();

                Map<String, Integer> current =
                    stack.peek();

                for (Map.Entry<String, Integer> entry
                     : top.entrySet()) {

                    current.put(
                        entry.getKey(),
                        current.getOrDefault(entry.getKey(), 0)
                        + entry.getValue() * multiplier
                    );
                }

            } else {

                int start = i;

                i++;

                while (i < formula.length() &&
                       Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }

                String atom =
                    formula.substring(start, i);

                start = i;

                while (i < formula.length() &&
                       Character.isDigit(formula.charAt(i))) {
                    i++;
                }

                int count =
                    start == i
                    ? 1
                    : Integer.parseInt(
                        formula.substring(start, i)
                    );

                Map<String, Integer> current =
                    stack.peek();

                current.put(
                    atom,
                    current.getOrDefault(atom, 0) + count
                );
            }
        }

        Map<String, Integer> map = stack.peek();

        StringBuilder result = new StringBuilder();

        for (String atom : new TreeSet<>(map.keySet())) {

            result.append(atom);

            int count = map.get(atom);

            if (count > 1) {
                result.append(count);
            }
        }

        return result.toString();
    }
}