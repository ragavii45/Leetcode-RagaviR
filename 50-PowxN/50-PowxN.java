// Last updated: 12/08/2026, 21:39:46
class Solution {
    public double myPow(double x, int n) {
        long N = n;  
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        double currentProduct = x;
        while (N > 0) {
            if (N % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            N /= 2;
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myPow(2.0, 10));
        System.out.println(sol.myPow(2.1, 3));    
        System.out.println(sol.myPow(2.0, -2));   
    }
}
