// Last updated: 12/08/2026, 21:38:26
import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int current =
                (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() &&
                   current < heights[stack.peek()]) {

                int height = heights[stack.pop()];

                int width = stack.isEmpty()
                    ? i
                    : i - stack.peek() - 1;

                maxArea = Math.max(
                    maxArea,
                    height * width
                );
            }

            stack.push(i);
        }

        return maxArea;
    }
}