// Last updated: 11/08/2026, 14:16:28
class Solution {
    public double[] getCollisionTimes(int[][] cars) {
        int n = cars.length;
        double[] ans = new double[n];
        Arrays.fill(ans, -1.0);

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int pos = cars[i][0];
            int speed = cars[i][1];

            while (!stack.isEmpty()) {
                int j = stack.peek();
                int pos2 = cars[j][0];
                int speed2 = cars[j][1];

                if (speed <= speed2) {
                    stack.pop();
                    continue;
                }

                double time = (double) (pos2 - pos) / (speed - speed2);
                if (ans[j] > 0 && time > ans[j]) {
                    stack.pop();
                } else {
                    break;
                }
            }

            if (!stack.isEmpty()) {
                int j = stack.peek();
                ans[i] = (double) (cars[j][0] - pos) / (speed - cars[j][1]);
            }

            stack.push(i);
        }

        return ans;
    }
}