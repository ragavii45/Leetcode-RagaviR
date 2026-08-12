// Last updated: 12/08/2026, 21:38:24
import java.util.*;

class Solution {

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        int columns = matrix[0].length;

        int[] heights = new int[columns];

        int max = 0;

        for (char[] row : matrix) {

            for (int j = 0; j < columns; j++) {

                if (row[j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            max = Math.max(
                max,
                largestRectangle(heights)
            );
        }

        return max;
    }

    private int largestRectangle(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int current =
                i == heights.length ? 0 : heights[i];

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