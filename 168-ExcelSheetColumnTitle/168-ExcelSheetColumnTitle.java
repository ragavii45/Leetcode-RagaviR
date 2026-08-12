// Last updated: 12/08/2026, 21:36:50
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            char currentChar = (char) ('A' + remainder);
            result.append(currentChar);
            columnNumber /= 26;
        }
        
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.convertToTitle(1));  
        System.out.println(sol.convertToTitle(28));  
        System.out.println(sol.convertToTitle(701)); 
    }
}
