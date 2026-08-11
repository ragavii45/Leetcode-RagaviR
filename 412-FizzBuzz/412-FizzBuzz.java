// Last updated: 11/08/2026, 14:20:53
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        
        return answer;
    }

    // Testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.fizzBuzz(3));   
        System.out.println(sol.fizzBuzz(5));   
        System.out.println(sol.fizzBuzz(15));  
    }
}