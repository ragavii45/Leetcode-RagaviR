// Last updated: 11/08/2026, 14:17:36
class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; 
        }
        
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;
        
        return dayOfYear;
    }
    
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.dayOfYear("2019-01-09")); 
        System.out.println(sol.dayOfYear("2019-02-10")); 
        System.out.println(sol.dayOfYear("2000-03-01")); 
    }
}