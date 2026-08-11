// Last updated: 11/08/2026, 14:19:24
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); 
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex = st.pop();
                ans[prevIndex] = i - prevIndex; 
            }
            st.push(i);
        }
        
        return ans; 
    }
}